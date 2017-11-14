# AdvancedSharedPreference
|Advanced Shared Preference for Android   [ ![Download](https://api.bintray.com/packages/rasheedk/AdvancedSharedPreference/advanced-sharedpreference/images/download.svg) ](https://bintray.com/rasheedk/AdvancedSharedPreference/advanced-sharedpreference/_latestVersion)



Usage:
'   '

** Just add below line in your module. **

` compile 'com.advancedsharedpreference:advanced-sharedpreference:0.0.1'   `

**  Features **

- [ ] Saves Objects to Shared Preference

- [ ] Retrieves saved Objects

- [ ]  Can save list of objects  eg: List<Modelname.class>  sampleList  in to shared preferece .

- [ ] powerfully extensible: You can easily extend TinyDB by writing new storages or modify the behaviour of storages with Middlewares.
100% test coverage: No explanation needed.

** Usage:  **




` AdvancedSharedPreference db = new AdvancedSharedPreference(context);  `

//Put data in database

` db.putInt("clickCount", 2);
db.putFloat("xPoint", 3.6f);
db.putLong("userCount", 39832L);

db.putString("userName", "john");
db.putBoolean("isUserMale", true); 

db.putList("MyUsers", mUsersArray);
db.putImagePNG("DropBox/WorkImages", "MeAtlunch.png", lunchBitmap); `

//Get data from database
`
int dataint = db.getInt("clickCount");
String datastring = db.getString("userName");
`
//These plus the corresponding get methods are all included
`

db.putObject(key, object);
db.putListObject(key, objectsArray); `


** Example of saving Objects: **


`  Person person = new Person("john", 24);
db.putObject("user1", person);

ArrayList<Person> usersWhoWon = new ArrayList<Person>();
db.putListObject("allWinners", usersWhoWon);  `










