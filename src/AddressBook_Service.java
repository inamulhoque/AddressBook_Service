public class AddressBook_Service {
    //UC1: Ability to create a AddressBook_Service DataBase
    create database AddressBook_Service;
    use database AddressBook_Service;
    //UC2: Ability to create Contact Table with first and last name, city, state, zip, phone number and email as its attributes
    create table Contact(firstName varchar(20), lastName varchar(20), city varchar(20), state varchar(20), zip int, phone bigint, email varchar(50));
    //UC3: Ability to insert new Contacts to Contact table
    insert into Contact values("Inamul", "Hoque", "Kharupetia", "Assam", 784115, 9101149275, "inamulhoque097@gmail.com");
    insert into Contact values("Nitya", "Sarma", "Shantipur", "Assam", 784125, 9101043168, "nityasarma@gmail.com");
    insert into Contact values("Nilima", "Hanun", "Mangaldoi", "Assam", 784125, 9101069570, "nilimahanun16@gmail.com");
    //UC4: Ability to edit existing contact person using their first name
    update Contact set firstName="Anuranan" where firstName="Nitya";
    //UC5: Ability to delete a person using person's first name
    delete from Contact where firstName = "Anuranan";
    //UC6: Ability to Retrieve Person belonging to a City or State from the Contact
    select * from Contact where city="Kharupetia" or state="Assam";
    //UC7: Ability to understand the size of Contact by City and State
    select COUNT(firstName) from Contact where city = "Kharupetia" or state = "Assam";
    //UC8: Ability to retrieve entries sorted alphabetically by Person’s name for a given state
    select state , firstName from Contact ORDER BY city ASC;
    //UC9: Ability to identify each Contact with name and Type
    alter table Contact add column Type varchar(10);
    update Contact SET Type = "Family" where firstName = "Inamul";
    update Contact SET Type = "Wife" where firstName = "Nilima";
    select * from Contact;
    //UC10: Ability to get number of contact persons i.e. count by type
    select COUNT(firstName) from Contact where Type = "Family";
    //UC11: Ability to add person to both Friend and Family
    insert into Contact values("Anuranan","Sharmah","Mangaldoi","Assam",784125,9085501136,"anuranan1889@gmail.com","Friend");
    insert into Contact values("Nitya", "Sarma", "Shantipur", "Assam", 784125, 9101043168, "nityasarma@gmail.com","Friend");
    insert into Contact values("Santosh", "Naik", "Hyderabad", "Telangana", 781012, 9854012345, "santoshnaik@gmail.com","Profession");
}
