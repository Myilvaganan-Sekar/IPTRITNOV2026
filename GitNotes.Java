

TesterA - Reg
TesterB - Login
TesterC - Profile
TesterD - Home page

Gmail [Reg [10] + Login [8] + Profile [4] + Home page [6] etc..,] 

TesterA [Reg - Automation] --> Zip [email]

TesterB [Reg --> followed by login] [Reg + login] --> Zip [email]

TesterC

TesterD [Not working]

file --> may deleted or file corrupt

Tracking [Missed] [Modified,new file, deleted file]

GIT --> Tracking device and Back up

Local Machine: GIT

Working Directory[reg.js | login.js] ---> staging [reg.js] --> local Repository
[Reg.js] 
Default branch: master

Web Hosting Device: GitHub [account] --[Permission - Grand and Revoke]
Repositories [Multiple]
Project Repository [Remote Repository] - Repo URL
Default branch: main [ We won't start dev the automation script in default branch]

Master ---> main

TA - modified [line 6 - filename]
TB - deleted [Filename]
TC - modified [line 8 - filename]
TD - Add new file [Filename]

Branch:
Own branch for each tester

TesterA --> QA001 [Local Repo] ---> Remote Repository [QA001]
TesterB --> QA002 [Local Repo] ---> Remote Repository [QA002]

QA001 ---> QA001[Complete] -- Review[Pull Request] --> merge to Main branch
QA002 --> QA002 [Complete] -- Review[Pull Request] --> merge to Main branch

QA003[Pull the code from main branch] --> QA003


Git - Installation completed:

Step 1: To create a local repository on your specific project directory 
Note: switch to the project folder through cmd
comment: git init

event: git status

Example:
C:\Users\myilv>mkdir Automation2026

C:\Users\myilv>cd Automation2026

C:\Users\myilv\Automation2026>git status
fatal: not a git repository (or any of the parent directories): .git

C:\Users\myilv\Automation2026>git init
Initialized empty Git repository in C:/Users/myilv/Automation2026/.git/













