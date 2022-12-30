package all.b22interface;

public class CAgent {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer ps = new ProxyServer(server);
        ps.browse();
    }
}

interface Network{
    void browse();
}


class Server implements Network{

    @Override
    public void browse() {
        System.out.println("真实服务器网站");
    }
}

class ProxyServer implements Network{
    private Network network;
    public ProxyServer(Network network){
        this.network = network;
    }
    public void check(){
        System.out.println("联网之前的检查工作");
    }

    @Override
    public void browse() {
        check();
    }
}
