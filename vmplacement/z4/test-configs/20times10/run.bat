@ECHO OFF
setlocal
set PYTHONPATH=%1
python -m unittest %2
endlocal