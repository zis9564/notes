**sudo** позволяет выполнять задачи, требующие прав администратора или root.\
- **-k** инвалидирует файл метки времени.\
- **-g** запускает команды от указанного имени группы или id\
- **-h** runs commands on the host\

---

**pwd** покажет путь к текущей директории\
- **-L** выводит содержимое env переменной включая символические ссылки.\
- **-P** печатает фактический путь к текущему каталогу.\

---

**cd** перемещаться по файлам и каталогам\
- **-cd ~[username]** goes to another user’s home directory.\
- **-cd ..** moves one directory up.\
- **-cd-** moves to your previous directory.\

---

**ls** (command) lists files and directories within a system\
- **-R** lists all the files in the subdirectories.\
- **-a** shows hidden files in addition to the visible ones.\
- **-lh** shows the file sizes in easily readable formats, such as MB, GB, and TB.\

---

**cat** (file) lists, combines, and writes file content to the standard output.\
   cat > file creates a new file.\
   cat file1 file2 > file3 merges file1 & file2 stores the output in file3\
   cat file displays content in reverse order.\


cp (command) to copy files or directories and their content\
   cp file /home/username/Documents copy one file from the current directory to another\
   cp f1 f2 f3 /home/username/Documents copy files to a directory\
   cp f1 f2 copy the content of a file to a new file in the same directory\
   cp -R /abs/path/from /abs/path/to copy an entire directory\


mv (command) move and rename files and directories\
   mv f /abs/path moves f to the directory /abs/path\
   mv old_name new_name\


mkdir (command) create one or multiple directories at once and set permissions for each of them\
   mkdir dirname\
   mkdir Music/Songs make directories recursively\
   -p create a directory between two existing folders. (mkdir -p path/to/dir will make the new “to” directory.)\
   -m sets the file permissions. to create a directory with full permissions for all users, mkdir -m777 dir_name.\
   -v prints a message for each created directory.\

rmdir (command) permanently delete an empty directory\
   rmdir -p dir/subdir removes an empty "subdir" and main folder "dir"\


rm (command) is used to delete files within a directory\
   rm filename1 filename2 filename3\
   -i prompts system confirmation before deleting a file.\
   -f allows the system to remove without a confirmation.\
   -r deletes files and directories recursively.\

touch (command) to create an empty file or generate and modify a timestamp in the Linux command line\
   touch /path/to/file.txt\

locate (command) find a file in the database system\
   locate -i school*not\
   -i turn off case sensitivity\
   * look for content that contains two or more words\

find (command) search for files within a specific directory and perform subsequent operations\
   find [option] [path] [expression]\
   find -name filename.txt\
   find ./ -type d -name dirname\

grep (command) lets you find a word by searching through all the texts in a specific file\
   grep blue notepad.txt\

df (command) report the system’s disk space usage, shown in percentage and kilobyte (KB)\
   df [options] [file]\
   -h human-readable format\
   -m displays information on the file system usage in MBs.\
   -k displays file system usage in KBs.\
   -T shows the file system type in a new column.\

du (command) to check how much space a file or a directory takes up\
   du /path/to/dir\
   -s offers the total size of a specified folder.\
   -m provides folder and file information in MB\
   -k displays information in KB.\
   -h informs the last modification date of the displayed folders and files.\

head (command) to view the first ten lines of a text\
   head [option] [file]\
   -n prints the first customized number of lines.\
   -c prints the first customized number of bytes of each file.\
   -q will not print headers specifying the file name.\

tail (command) displays the last ten lines of a file\
   tail [option] [file]\
   tail -n colors.txt\

diff (command) compares two contents of a file line by line. display the parts that do not match
   diff [option] file1 file2
   diff note.txt note_update.txt
   -c displays the difference between two files in a context form.
   -u displays the output without redundant information.
   -i makes the diff command case insensitive.

tar (command) archives multiple files into a TAR file
   tar [options] [archive_file] [file or directory to be archived]
   tar -cvf newarchive.tar /home/user/Documents
   -x extracts a file.
   -t lists the content of a file.
   -u archives and adds to an existing archive file.

chmod (command) modifies a file or directory’s read, write, and execute permissions.
   chmod [option] [permission] [file_name]
   chmod 777 note.txt
   -c displays information when a change is made.
   -f suppresses the error messages.
   -v displays a diagnostic for each processed file.

chown (command) change the ownership of a file, directory, or symbolic link to a specified username.
   chown [option] owner[:group] file(s)
   chown linuxuser2 filename.txt

jobs (command) will display all the running processes along with their statuses\
   jobs [options] jobID
   -l lists process IDs along with their information.
   -n lists jobs whose statuses have changed since the last notification.
   -p lists process IDs only.

kill (command) terminate an unresponsive program manually
   ps ux (commnd) return process identification number (PID)
   kill [signal_option] PID
   kill SIGKILL 63773
   SIGTERM requests a program to stop running and gives it some time to save all of its progress. The system will use this by default if you don’t specify the signal when entering the kill command.
   SIGKILL forces programs to stop, and you will lose unsaved progress.

ping (command) checking whether a network or a server is reachable
   ping [option] [hostname_or_IP_address]
   ping google.com