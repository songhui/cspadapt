'''
Created on 15 Mar 2014

@author: huis
'''



pe10_5=[0.6939518451690674, 2.008455991744995, 1.8348751068115234, 1.0126118659973145, 1.7101538181304932, 0.7390320301055908, 1.623335838317871, 0.5929341316223145, 2.0522279739379883, 1.3633129596710205, 1.0153210163116455, 0.66286301612854, 0.7225871086120605, 1.4665660858154297, 1.2608561515808105, 0.7374539375305176, 1.6363630294799805, 1.7981140613555908, 0.7205550670623779, 1.8766820430755615, 0.8161411285400391, 1.741529941558838, 1.849487066268921, 0.646028995513916, 1.2293431758880615, 1.592231035232544, 1.4908640384674072, 1.4427909851074219, 1.818626880645752, 1.367480993270874, 1.3179709911346436, 1.2587840557098389, 1.5186388492584229, 1.7979869842529297, 0.7587840557098389, 1.640589952468872, 0.8497929573059082, 1.6978321075439453, 1.0835790634155273, 0.6178011894226074, 1.6258161067962646, 1.606943130493164, 0.8630249500274658, 0.6932950019836426, 1.5439178943634033, 1.2890222072601318, 0.672760009765625, 1.6225848197937012, 1.808521032333374, 1.2037479877471924]

con10_5 = [38.81099987030029, 40.13199996948242, 31.11299991607666, 36.793999910354614, 35.72000002861023, 34.8439998626709, 34.687000036239624, 25.602999925613403, 28.85599994659424, 46.324000120162964, 35.36199998855591, 28.886000156402588, 37.021000146865845, 36.99399995803833, 47.48900008201599, 32.2279999256134, 35.08099985122681, 29.83999991416931, 31.069999933242798, 40.0770001411438, 30.532999992370605, 45.96299982070923, 35.00500011444092, 42.61399984359741, 26.878999948501587, 33.88900017738342, 31.07100009918213, 31.51699995994568, 34.71399998664856, 31.2810001373291]

pe20_10 = [12.725641012191772, 13.833499193191528, 19.016478061676025, 15.294802188873291, 17.72799301147461, 14.474985837936401, 16.971882104873657, 14.432867050170898, 16.224630117416382, 16.74827289581299, 16.296711206436157, 13.10253095626831, 16.32465696334839, 15.710182905197144, 13.791234970092773, 14.691956996917725, 15.338239908218384, 14.382678985595703, 13.061308860778809, 29.966463088989258, 16.827417135238647, 18.81187605857849, 17.03213095664978, 18.29962992668152, 12.290671110153198, 14.551247119903564, 13.111500024795532, 13.565562963485718, 14.660328149795532, 16.90642213821411, 19.462050914764404, 16.215954065322876, 14.019767045974731, 15.744396209716797, 18.280757904052734, 23.732729196548462, 13.176561117172241, 17.198002815246582, 22.221282958984375, 16.870720148086548, 17.852584838867188, 21.368510961532593, 14.29526400566101, 15.103745937347412, 17.66958999633789, 19.521672010421753, 24.98262906074524, 13.143152952194214, 16.417745113372803, 16.974436044692993]

con20_10 = [199.82542991638184, 117.70773196220398, 152.5197229385376, 142.37414407730103, 137.43086099624634, 121.56995391845703, 135.4887490272522, 207.4898669719696, 170.12673091888428, 129.19238901138306, 141.9961221218109, 136.95883297920227, 142.16013097763062, 126.22521901130676, 129.01637983322144, 128.76936602592468, 204.63170409202576, 121.35394096374512, 158.62207293510437, 155.6279010772705, 144.1032419204712, 167.69059109687805, 92.05226612091064, 130.90548706054688, 120.53489398956299, 187.07769989967346, 125.25816512107849, 136.4258029460907, 163.26033782958984, 173.26890993118286]

pe15_10 = [0.42172813415527344, 0.46164512634277344, 0.4439690113067627, 0.5426359176635742, 0.478316068649292, 0.5468730926513672, 0.5007121562957764, 0.46643519401550293, 0.5882768630981445, 0.42911696434020996, 0.5132009983062744, 0.6867549419403076, 0.4081380367279053, 0.5756781101226807, 0.45351099967956543, 0.4814951419830322, 0.5197138786315918, 0.4250359535217285, 0.42720794677734375, 0.46402597427368164, 0.41443586349487305, 0.465440034866333, 0.41302990913391113, 0.4253110885620117, 0.4702918529510498, 0.5625348091125488, 0.43648600578308105, 0.4361119270324707, 0.5029861927032471, 0.44331908226013184]

con15_10 = [2.748157024383545, 2.7761590480804443, 2.5091440677642822, 2.772158145904541, 2.6941540241241455, 2.848162889480591, 2.788158893585205, 2.7851600646972656, 2.8321621417999268, 2.7031548023223877, 2.7641589641571045, 2.8601632118225098, 2.8571629524230957, 2.736157178878784, 2.7101550102233887, 2.671152114868164, 2.946168899536133, 2.9461679458618164, 2.97117018699646, 2.723155975341797, 3.0411739349365234, 2.6981539726257324, 2.75115704536438, 2.807159900665283, 2.6911540031433105, 2.873163938522339, 3.1741809844970703, 2.876163959503174, 3.1011781692504883, 2.9361679553985596]

pe17_10 = [2.7446048259735107, 3.4139060974121094, 4.070673942565918, 3.0032269954681396, 2.738597869873047, 3.637974977493286, 4.089855194091797, 2.839200973510742, 2.411099910736084, 3.0616860389709473, 3.472646951675415, 2.668191909790039, 4.6710169315338135, 2.9255640506744385, 2.683363914489746, 2.466459035873413, 2.7127439975738525, 3.930941104888916, 3.55769681930542, 3.632789134979248, 2.5599920749664307, 2.449941873550415, 4.4415130615234375, 3.287719964981079, 3.4545629024505615, 3.0822291374206543, 2.90122389793396, 2.9955739974975586, 3.381744861602783, 2.874472141265869]

con17_10 = [7.9524548053741455, 7.3914220333099365, 8.702497959136963, 8.825505018234253, 7.757443904876709, 7.831448078155518, 8.405481100082397, 7.949453830718994, 10.479598999023438, 8.702497005462646, 7.742443084716797, 8.089462995529175, 9.145523071289062, 9.667552947998047, 9.2865309715271, 7.639436960220337, 8.468483924865723, 7.883450984954834, 7.691440105438232, 7.989457130432129, 8.039460182189941, 10.245585918426514, 8.056461095809937, 10.08057689666748, 7.9334540367126465, 7.876449823379517, 9.179524898529053, 7.5834338665008545, 9.082519769668579, 8.940510988235474]

con18_10 = [24.310390949249268, 64.84470796585083, 66.25079011917114, 17.681010961532593, 64.44168591499329, 64.06866478919983, 52.5250039100647, 64.23367404937744, 55.740188121795654, 59.46040105819702, 44.68155598640442, 55.43317103385925, 39.155240058898926, 63.22561597824097, 75.29830598831177, 35.253015995025635, 55.454171895980835, 56.074207067489624, 100.15172815322876, 67.40685606002808, 150.1395869255066, 52.15198302268982, 34.495973110198975, 75.70132994651794, 14.048802852630615, 22.00425910949707, 57.76530408859253, 10.607607126235962, 11.378650188446045, 88.38605499267578]

pe18_10 = [8.113264083862305, 9.448324918746948, 7.854573011398315, 9.562029123306274, 8.949124813079834, 9.138449907302856, 8.664893865585327, 8.419456958770752, 9.586854934692383, 7.726600885391235, 9.100905895233154, 11.479958772659302, 7.387712001800537, 9.371387004852295, 9.42141604423523, 8.020433902740479, 8.192692995071411, 8.055921077728271, 12.028566122055054, 10.315187931060791, 6.786565065383911, 9.575685024261475, 8.20711898803711, 8.844317197799683, 9.763643980026245, 8.252798080444336, 8.56423807144165, 8.961206912994385, 12.610844850540161, 10.179861068725586]

pe12_6 = [7.487217903137207, 8.025760889053345, 8.5535888671875, 7.689741849899292, 8.516958951950073, 7.535858869552612, 6.948587894439697, 10.128700971603394, 7.555837869644165, 10.141924142837524, 8.215837955474854, 7.541286945343018, 8.239171981811523, 9.237637042999268, 9.571764945983887, 9.421989917755127, 8.239913940429688, 6.829704999923706, 8.356101036071777, 8.112376928329468, 7.763105154037476, 9.436153173446655, 9.135436058044434, 10.367215871810913, 9.06888198852539, 8.278692960739136, 9.085724830627441, 10.049154043197632, 7.6068150997161865, 8.577934980392456]

con12_6 = [110.240305185318, 15.043861150741577, 52.8900249004364, 53.82407903671265, 64.83870792388916, 40.88633918762207, 15.10586404800415, 74.84028100967407,  43.43148422241211, 50.97691583633423, 31.31779193878174, 30.535746812820435, 67.6948721408844, 41.63438105583191, 46.50565981864929, 20.24215793609619,  68.92094206809998, 74.46125888824463, 60.11843800544739, 43.190471172332764, 75.92534303665161, 57.10726594924927, 40.50031614303589, 53.98108696937561, 52.75801706314087, 41.932398080825806, 63.346622943878174, 55.61618113517761, 16.1759250164032, 54.87513780593872]

alltogether = [pe10_5[0:30], con10_5, pe12_6, con12_6, pe15_10, con15_10, pe17_10, con17_10, pe18_10, con18_10, pe20_10[0:30], con20_10]