public class Receiver {
    public static void main(String[] args) throws Exception {
        TCPServerSocket tcpServerSocket = new TCPServerSocketImpl(8080);
//        TCPSocket tcpSocket =
        tcpServerSocket.accept();
//        tcpSocket.receive("receiving.mp3");
//        tcpSocket.close();
//        tcpServerSocket.close();
    }
}
