package com.containersol.minimesos.main;

public interface Command {

    /**
     * Validates combination of command parameters
     *
     * @return true if command parameters are valid
     */
    boolean validateParameters();

    /**
     * @return name of the command
     */
    String getName();

    /**
     * Executes the command
     */
    void execute();

}
