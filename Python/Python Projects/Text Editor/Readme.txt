We'll be modeling a Document class that might be
used in a text editor or word processor.

We might start with a str for the Document contents, but in Python, strings aren't
mutable (able to be changed). Once a str is defined, it is forever. We can't insert
a character into it or remove one without creating a brand new string object. That
would be leaving a lot of str objects taking up memory until Python's garbage
collector sees fit to clean up behind us.

So, instead of a string, we'll use a list of characters, which we can modify at will. In
addition, a Document class would need to know the current cursor position within
the list, and should probably also store a filename for the document.

Now, what methods should it have? There are a lot of things we might want to
do to a text document, including inserting, deleting, and selecting characters, cut,
copy, paste, the selection, and saving or closing the document. It looks like there
are copious amounts of both data and behavior, so it makes sense to put all this
stuff into its own Document class.

what if we want to connect more than just arrow keys. What if we want to connect
the Home and End keys as well? We could add more methods to the Document class
that search forward or backwards for newline characters (in Python, a newline
character, or \n represents the end of one line and the beginning of a new one) in
the string and jump to them, but if we did that for every possible movement action
(move by words, move by sentences, Page Up, Page Down, end of line, beginning of
whitespace, and more), the class would be huge. Maybe it would be better to put those
methods on a separate object. So, let us turn the cursor attribute into an object that is
aware of its position and can manipulate that position. We can move the forward and
back methods to that class, and add a couple more for the Home and End keys:

This framework is simple (though it might be a bit time consuming!) to extend to
create and edit a complete plaintext document. Now, let's extend it to work for rich
text; text that can have bold, underlined, or italic characters. To do that, we're obviously 
going to need a class for characters. This class will have an attribute representing 
the character, as well asthree Boolean attributes representing whether it is bold, italic, or 
underlined.

There is a very important special method on the object class that we can take
advantage of to represent our characters. This method, called __str__ (two
underscores, like __init__), is used in string manipulation functions like print
and the str constructor to convert any class to a string.
This class allows us to create characters and prefix them with a special character
when the str() function is applied to them. Nothing too exciting there. We only
have to make a few minor modifications to the Document and Cursor classes to
work with this class.

In addition, we need to modify the string property on Document to accept the new
Character values.


As expected, whenever we print the string, each bold character is preceded by a
* character, each italic character by a / character, and each underlined character
by a _ character. All our functions seem to work, and we can modify characters in
the list after the fact. We have a working rich text document object that could be
plugged into a proper user interface and hooked up with a keyboard for input and
a screen for output. Naturally, we'd want to display real bold, italic, and underlined
characters on the screen, instead of using our __str__ method, but it was sufficient
for the basic testing we demanded of it.