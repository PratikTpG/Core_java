package Abstraction;

public class UserInterfaceImpl implements UserServices,CommonService{
    @Override
    public void addUser() {
        System.out.println("add user");
    }

    @Override
    public void deleteUser() {
        System.out.println("delete user");
    }

    @Override
    public void print() {
        System.out.println("Common Service");
    }
}
