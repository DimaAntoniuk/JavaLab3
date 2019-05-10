package ua.lviv.iot.services;

public class ExhibitNotFoundException extends RuntimeException {

    ExhibitNotFoundException(Integer id) {
        super("Could not found exhibit with id:" + id);
    }
}
