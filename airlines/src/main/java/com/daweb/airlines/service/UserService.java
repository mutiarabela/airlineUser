package com.daweb.airlines.service;

import com.daweb.airlines.model.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;

@Service
public class UserService { //For User Service
    User addUser;

    HashMap<Integer, User> users;

//    public UserService(){ //Hardcode create user
//        User addFirstUser = new User();
//
//        addFirstUser.setIdUser(1);
//        int idFirstUser = addFirstUser.getIdUser();
//
//        addFirstUser.setFirstNameUser("Mutiara");
//        addFirstUser.setLastNameUser("Bela");
//        addFirstUser.setPhoneNumUser("082111711170");
//        addFirstUser.setNameUser("mutiarabela");
//        addFirstUser.setEmailUser("bela@gmail.com");
//        addFirstUser.setPasswordUser("123456789");
//
//        if(users == null){
//            users = new HashMap<>();
//        }
//
//        users.put(idFirstUser, addFirstUser);
//
//        User addSecondUser = new User();
//
//        addSecondUser.setIdUser(1);
//        int idSecondUser = addSecondUser.getIdUser();
//
//        addSecondUser.setFirstNameUser("Niall");
//        addSecondUser.setLastNameUser("Horan");
//        addSecondUser.setPhoneNumUser("081212999970");
//        addSecondUser.setNameUser("niallhoran");
//        addSecondUser.setEmailUser("niall@gmail.com");
//        addSecondUser.setPasswordUser("11111111");
//
//        users.put(idSecondUser, addSecondUser);
//
//        User addThirdUser = new User();
//
//        addThirdUser.setIdUser(1);
//        int idThirdUser = addSecondUser.getIdUser();
//
//        addThirdUser.setFirstNameUser("Nur");
//        addThirdUser.setLastNameUser("Falah");
//        addThirdUser.setPhoneNumUser("081218077761");
//        addThirdUser.setNameUser("nurfalah");
//        addThirdUser.setEmailUser("falah@gmail.com");
//        addThirdUser.setPasswordUser("123123123");
//
//        users.put(idThirdUser, addThirdUser);
//    }

    public User createUser(User user) { //Create user by input
        addUser = new User();

        addUser.setIdUser(user.getIdUser());
        int idUser = addUser.getIdUser();

        addUser.setIdUser(user.getIdUser());
        addUser.setFirstNameUser(user.getFirstNameUser());
        addUser.setLastNameUser(user.getLastNameUser());
        addUser.setPhoneNumUser(user.getPhoneNumUser());
        addUser.setNameUser(user.getNameUser());
        addUser.setEmailUser(user.getEmailUser());
        addUser.setPasswordUser(user.getPasswordUser());

        users.put(idUser, addUser);
        return addUser;
    }

    public User getUser (String idUser) { //Get specific user to view
        return users.get(idUser);
    }

    public Collection<User> getAllUser(){ //Get all added user
        return users.values();
    }

    @Service
    public class UserService { //For User Service
        User addUser;

        HashMap<Integer, User> users;

        public UserService(){ //Hardcode create user
            User addFirstUser = new User();

            addFirstUser.setIdUser(1);
            int idFirstUser = addFirstUser.getIdUser();

            addFirstUser.setFirstNameUser("Mutiara");
            addFirstUser.setLastNameUser("Bela");
            addFirstUser.setPhoneNumUser("082111711170");
            addFirstUser.setNameUser("mutiarabela");
            addFirstUser.setEmailUser("bela@gmail.com");
            addFirstUser.setPasswordUser("123456789");

            if(users == null){
                users = new HashMap<>();
            }

            users.put(idFirstUser, addFirstUser);

            User addSecondUser = new User();

            addSecondUser.setIdUser(1);
            int idSecondUser = addSecondUser.getIdUser();

            addSecondUser.setFirstNameUser("Niall");
            addSecondUser.setLastNameUser("Horan");
            addSecondUser.setPhoneNumUser("081212999970");
            addSecondUser.setNameUser("niallhoran");
            addSecondUser.setEmailUser("niall@gmail.com");
            addSecondUser.setPasswordUser("11111111");

            users.put(idSecondUser, addSecondUser);

            User addThirdUser = new User();

            addThirdUser.setIdUser(1);
            int idThirdUser = addSecondUser.getIdUser();

            addThirdUser.setFirstNameUser("Nur");
            addThirdUser.setLastNameUser("Falah");
            addThirdUser.setPhoneNumUser("081218077761");
            addThirdUser.setNameUser("nurfalah");
            addThirdUser.setEmailUser("falah@gmail.com");
            addThirdUser.setPasswordUser("123123123");

            users.put(idThirdUser, addThirdUser);
        }

        public User createUser(User user) { //Create user by input
            addUser = new User();

            addUser.setIdUser(user.getIdUser());
            int idUser = addUser.getIdUser();

            addUser.setIdUser(user.getIdUser());
            addUser.setFirstNameUser(user.getFirstNameUser());
            addUser.setLastNameUser(user.getLastNameUser());
            addUser.setPhoneNumUser(user.getPhoneNumUser());
            addUser.setNameUser(user.getNameUser());
            addUser.setEmailUser(user.getEmailUser());
            addUser.setPasswordUser(user.getPasswordUser());

            users.put(idUser, addUser);
            return addUser;
        }

        public User getUser (String idUser) { //Get specific user to view
            return users.get(idUser);
        }

        public Collection<User> getAllUser(){ //Get all added user
            return users.values();
        }
}
