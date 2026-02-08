@echo off
title Git Auto Push

set BRANCH=master
set INTERVAL=100
set COMMIT_MSG=Learning DSA for placements

:loop
git status --porcelain > temp_git_status.txt
for %%A in (temp_git_status.txt) do set SIZE=%%~zA
del temp_git_status.txt

if not "%SIZE%"=="0" (
    git add .
    git commit -m "%COMMIT_MSG%"
    git push origin %BRANCH%
)

timeout /t %INTERVAL% > nul
goto loop
