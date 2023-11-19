import java util.objects;
Public abstract class Person {
    Private String FirstName;
   // Private String Lastname;

    Public  Person(String FirstName)
    //String Lastname)
    {
         this.FirstName = FirstName;
     //    this.Lastname = Lastname;

    }
 Public String getFirstName()
    {
        return FirstName;
    }
    Public void SetFirstName(String FirstName)
        this.FirstName = FirstName;
}

