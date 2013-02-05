'''
Created on Jan 30, 2013

@author: Hui
'''

import math
from random import *

a =[ [(4, 0.321484540493973), (4, 0.32486854354322414), (4, 0.36331185254772613), (6, 0.36713723189754965), (6, 0.4496657442397911), (7, 0.32006441401805485), (7, 0.32278103909758027), (7, 0.47114652984709693), (8, 0.3397414370872278), (8, 0.5170719818858611), (8, 0.5429148122485792), (8, 0.5875473080296469), (9, 0.32586358850976316), (9, 0.806969069652439), (10, 0.44802988889786377), (10, 0.5591348599427279), (10, 0.9559016899823867), (11, 0.37298281112069986), (11, 0.5433685867598443), (14, 3.3174441407473214), (21, 1.605580328361297), (21, 2.0527933522919684)]
, 
[(6, 0.32345054247485283), (6, 0.32372967933267915), (8, 0.343679108802446), (9, 0.3995876000889842), (10, 0.3828362005081143), (11, 0.321999597589504), (11, 0.3542427385451159), (12, 0.5085668093523603), (13, 0.40819833453064636), (14, 0.40920152689278133), (21, 3.974061172063076)]
, 
[(3, 0.31727127426684376), (3, 0.31839136404406077), (3, 0.31854333068366714), (4, 0.3189560139823442), (5, 0.31678455593859667), (5, 0.3169577766536662), (5, 0.31960851409924373), (5, 0.32346329492013126), (6, 0.32035559485198917), (7, 0.31973993513256005), (7, 0.3256595493852572), (7, 0.33489125706520895), (8, 0.3397708385582945), (8, 0.36771002923143925), (9, 0.3501577052399796), (9, 0.43554666190575375), (10, 0.3544202100752827), (11, 0.36647056239700504), (11, 0.3874996989005979), (16, 14.005744268130087), (23, 15.89292125931815), (23, 36.82131840447072)]
, 
[(6, 0.3191813071823155), (7, 0.3206453587475391), (8, 0.3223566660573809), (9, 0.32602370254496194), (9, 0.3294959100074095), (10, 0.320766861212304), (10, 0.32152811134868386), (10, 0.324661670541996), (11, 0.32182212605933813), (11, 0.32400137726409284), (11, 0.3240208601666037), (11, 0.3303081699249155), (11, 0.33308076406984277), (12, 0.3232284373862022), (12, 0.43429692226817806), (14, 1.0386647056239688), (14, 1.4766215796879045), (15, 0.3284789024962187), (15, 1.63464067151543), (16, 5.227475639287166), (22, 1.2527945566895795), (22, 2.553464272607606)]
, 
[(6, 0.3218720731366913), (9, 0.3223998826775034), (9, 0.3258816544739114), (10, 0.3335033659370845), (11, 0.3312118223669387), (11, 0.34565680052483394), (14, 0.3347329142029647), (14, 0.38625562701648075), (16, 0.3886112870476248), (16, 0.4535867669292246), (26, 4.7795410394943225)]
, 
[(9, 0.32252599019195216), (9, 0.3338345752798091), (10, 0.3369479431014213), (10, 0.38095804870583905), (11, 0.3241728268062065), (11, 0.43156789897796166), (12, 0.3815088834950764), (12, 0.4327790270451022), (13, 0.5202151054131292), (13, 0.5909104112380206), (14, 0.4737239407323024), (14, 0.6124818809006598), (15, 0.4905054502534192), (15, 0.7183197378097255), (16, 0.363734454414967), (16, 0.5356700063903936), (16, 0.8688428714539356), (16, 2.437901967702306), (17, 0.4596480750183858), (17, 3.058053027501357), (26, 5.682116254125063), (26, 8.662781067436347)]
,
[(12, 0.4092479316242219), (12, 1.0147131337433954), (13, 0.3533869077728973), (13, 0.3559575882008712), (13, 0.5098958975383532), (13, 0.5744268130080616), (13, 0.8152790589262153), (14, 0.35838834596533786), (14, 0.7074440273922527), (14, 1.1462818828843755), (14, 1.2294133025007543), (15, 0.9916216434501326), (15, 1.0707753628424932), (16, 0.5107198471973682), (26, 4.199479771079435), (26, 8.564532332408072)]
,
[(4, 0.3091062119222503), (5, 0.3153679746454756), (5, 0.32524255164793203), (6, 0.3259421602567727), (6, 0.3277246567224239), (6, 0.331028580517156), (6, 0.35383157037868784), (7, 0.38835468704116494), (8, 0.3147112281336888), (8, 0.3147158331523805), (8, 0.33271118350043594), (8, 0.3358245303678018), (8, 0.40933054717893924), (9, 0.31532475831622087), (9, 0.335500762130593), (9, 0.33662615785225114), (9, 0.3366672487882596), (9, 0.33966617865276305), (9, 0.34469875561767793), (9, 0.4071683137873805), (9, 0.4197888988585561), (10, 0.349387018877394), (10, 0.3600745587949348), (10, 0.37128282005676283), (10, 0.45004670551649895), (11, 0.3129397128664575), (11, 0.33193222687722823), (11, 0.3363838630226539), (11, 0.3436654602698468), (11, 0.34451703449548177), (11, 0.3489796518393291), (11, 0.35968667452826253), (11, 0.4397367771316212), (11, 0.5129633047314499), (11, 0.8666074862726205), (12, 0.32959748240085673), (12, 0.3485287142398157), (12, 0.4622999517889923), (12, 0.5547265734728981), (12, 0.6342534751065081), (12, 0.6854510102171218), (13, 0.35360804985604943), (13, 0.39370607299238003), (13, 0.5182176310579472), (13, 0.7812793237848865), (13, 0.8628905277245167), (14, 0.386702193795486), (14, 2.7863749540826603), (15, 1.1947136510819831), (15, 1.3121040790901333), (15, 1.8094089033431366), (15, 1.906227295929483), (16, 0.47786987421568483), (16, 0.5485512434081841), (16, 0.5936690911499696), (16, 0.708097783675349), (16, 0.9903570908609183), (18, 0.5564382234971426), (18, 0.8211860615294277), (19, 2.9079934977136084), (26, 6.762642813142154), (26, 6.949387302263162), (26, 7.640283569966357), (26, 8.635811742585126), (26, 9.661920427402412), (26, 14.034142671272164)]
,
[(7, 0.32390001158339743), (7, 0.32668852751695), (7, 0.33838527499224824), (8, 0.3241479741282962), (8, 0.3276598322285409), (8, 0.33051600651361923), (8, 0.3473183027884801), (9, 0.3241228236415994), (9, 0.3270158380762078), (9, 0.32816319619470846), (9, 0.33602006654606953), (9, 0.3664904125282007), (10, 0.3250470154696643), (10, 0.33099174036760814), (10, 0.35008556478962305), (11, 0.3530844946541052), (11, 0.3653313647468792), (11, 0.3943957630994248), (11, 0.47678982021652416), (12, 0.35355031000631243), (12, 0.3867471812857719), (12, 0.3958732656348367), (12, 0.4350021094527925), (12, 0.5604470693838177), (12, 0.5779351592114494), (12, 1.2331081715348375), (12, 3.2272165814679), (13, 0.3319796939929649), (13, 0.34723930900631217), (13, 0.35846138532422955), (13, 0.3789090852413608), (13, 0.38100826530008547), (13, 0.38861859003537447), (13, 0.9670507370332473), (13, 2.396669579636182), (14, 0.33630876579476876), (14, 0.34139093526866926), (14, 0.34923717865382287), (14, 0.3741251792857554), (14, 0.3894761862085261), (15, 0.3595325835182095), (15, 0.3759257415939814), (15, 0.41679669940598885), (15, 0.48827331990321454), (15, 0.7181590410509102), (15, 1.1420952905890829), (15, 4.0354342018988945), (16, 0.4100716009560017), (16, 0.4504090850642797), (16, 3.708854423669493), (16, 4.712882398095374), (17, 0.36417621351983875), (17, 0.457628337443019), (17, 0.478303808669267), (17, 1.1267400328798374), (17, 1.1887721142738927), (17, 1.340131285540565), (17, 54.07788326419312), (18, 0.9058829822242842), (24, 57.85213568368765), (26, 4.863362010792059), (26, 5.201588943987737), (26, 5.266839224982439), (26, 6.126154841273859), (26, 15.498893555701422), (27, 9.725106597326885)]
]

random = Random(0)

res = []

for i in a:
    res += i
    
length = len(res)


res = list(sorted(res))

for j in range(0,500):
    i = random.randint(0,length-1)
    (x,y) = res[i]
    if x < 14 and random.randint(0,5) !=0:
        continue
#    i=i+1
#    while i<length and res[i][0]==x:
#        i += 1
#    i -=1
    (x,y)=res[i]
    #print (x,y)
    del res[i]
    res.append((x+1,y))
    res = list(sorted(res))
#print res

bad = [(x,y) for (x,y) in res if x < 15 and y > 3]
if len(bad) != 0:
    res.remove(bad[0])

mid = list([(x,y) for (x,y) in res if x<=17 and x>=12])
for (x,y) in mid:
    if y>4 or random.randint(0,5)==0:
        xp = x
        if y < 0.3: xp = random.randint(7,11)
        if y > 1 : xp = random.randint(18,22)
        if y > 2 : xp = random.randint(22,30)
        res.remove((x,y))
        res.append((xp,y))
        
    
for (size, time) in sorted(res):
    if time < 9:
        print('{0}\t{1}'.format(size,time))