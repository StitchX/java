package project.project3.service;

/**
 * @author Eva   Email:
 * @Description
 * @data 2023/1/5 11:05
 */
public class TeamException extends Exception{
    @java.io.Serial
    static final long serialVersionUID = -2327516993124229948L;

    public TeamException(){

    }
    public TeamException(String msg){
        super(msg);
    }
}
