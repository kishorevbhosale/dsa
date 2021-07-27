package solid.proxy;

interface CmdExecute {
    void runcmd(String cmd);
}

class CmdExecuteImpl implements CmdExecute {

    @Override
    public void runcmd(String cmd) {
        System.out.println("Executing command : " + cmd);
    }
}

class CmdExecuteProxy implements CmdExecute {
    private boolean isAdmin = false;
    private CmdExecute executor;

    public CmdExecuteProxy(String user, String password) {
        if ("admin".equals(user) && "root".equals(password)) isAdmin = true;
        executor = new CmdExecuteImpl();
    }

    @Override
    public void runcmd(String cmd) {
        if (isAdmin)
            System.out.println("Running command : "+cmd);
        else
            System.out.println("No access");
    }
}

public class ProxyPatternDemo {
    public static void main(String[] args) {
        CmdExecute execute = new CmdExecuteProxy("admin", "root");
        execute.runcmd("ls");
    }
}
