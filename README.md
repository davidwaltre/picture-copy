# picture-copy

## About
This program is a simple-written Java program to copy images from one directory to another. The picture names **can** contain prefixes - *such as "IMG"* - which will be added in front of the names automatically for easier use.

## Usage
The program "guides" the user through the process of setting a source- and destination folder as well as setting prefixes or copying images. When the folders and the prefix are set, the user can simply input the name - *e.g. 8022 for IMG8022 with the prefix IMG* - and the program will check for .jpg, .png, .jpeg and .mp4 files. If one is found, the file will be copied to the destination folder. If not, an error will be displayed and the user can input a new name. *You'll need at least Java 14!*

## Further information

This program is written very simple - and probably not very good. It serves its purpose. In the future, the following things are planned:

## To-do
- Improve method "copy" in class "picture"
- Add GUI
- Add support of more file formats - *e.g. .mov*
- Add .csv file-name data sheet import
- Make file formats non case sensitive
- Make prefix easier changeable by user

## Contributing
If you'd like to contribute, feel free to do so! I am happy about every contribution to improve the program. For smaller contributions - please open an issue.
