We'll be designing a simple real estate application that allows an agent to manage 
properties available for purchase or rent.

There will be two types of properties: apartments and
houses. The agent needs to be able to enter a few relevant details about new properties,
list all currently available properties, and mark a property as sold or rented. For
brevity, we won't worry about editing property details or reactivating a property
after it is sold.

we'll need to represent a property.
Houses and apartments may need separate classes. Rentals and purchases also seem
to require separate representation. Since we're focusing on inheritance right now,
we'll be looking at ways to share behavior using inheritance or multiple inheritance.

House and Apartment are both types of properties, so Property can be a superclass
of those two classes. Rental and Purchase will need some extra thought; if we use
inheritance, we'll need to have separate classes, for example, for HouseRental and
HousePurchase, and use multiple inheritance to combine them.

Now then, what attributes might be associated with a Property class? Regardless
of whether it is an apartment or a house, most people will want to know the square
footage, number of bedrooms, and number of bathrooms.

If the property is a house, it will want to advertise the number of stories, whether
it has a garage (attached, detached, or none), and whether the yard is fenced. An
apartment will want to indicate if it has a balcony, and if the laundry is ensuite,
coin, or off-site.

Both property types will require a method to display the characteristics of that
property. At the moment, no other behaviors are apparent.

Rental properties will need to store the rent per month, whether the property is
furnished, and whether utilities are included, and if not, what they are estimated to
be. Properties for purchase will need to store the purchase price and estimated annual
property taxes. For our application, we'll only need to display this data, so we can get
away with just adding a display() method similar to that used in the other classes.

Finally, we'll need an Agent object that holds a list of all properties, displays those
properties, and allows us to create new ones. Creating properties will entail prompting
the user for the relevant details for each property type. This could be done in the Agent
object, but then Agent would need to know a lot of information about the types of
properties. A better idea is to create a static method that does the prompting and returns 
a dictionary of the prompted parameters. Then, all the Agent has to do is prompt the user 
for the type of property and payment method, and ask the correct class to instantiate itself.