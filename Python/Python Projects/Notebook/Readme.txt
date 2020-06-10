The obvious object is the Note object; less obvious one is a Notebook container object.

Note objects have attributes for memo itself, tags, and creation_date. Each note will
also need a unique integer id so that users can select them in a menu interface. Notes
could have a method to modify note content and another for tags, or we could just
let the notebook access those attributes directly. To make searching easier, we should
put a match method on the Note object. This method will accept a string and can tell
us if a note matches the string without accessing the attributes directly.

The Notebook object obviously has the list of notes as an attribute. It will also need
a search method that returns a list of filtered notes.

But how do we interact with these objects? We've specified a command-line app,
which can mean either that we run the program with different options to add or edit
commands, or we have some kind of a menu that allows us to pick different things to
do to the notebook.

We should try to design it such that either interface is supported
and future interfaces, such as a GUI toolkit or web-based interface, could be added in
the future.

Notebook will need some methods for those interfaces to interact with. We need
to be able to add a new note, and modify an existing note by id, in addition to the
search method we've already discussed.

Before writing any code, let's define the folder structure for this project.
parent_directory/
	notebook.py
	menu.py
command_line.ipynb