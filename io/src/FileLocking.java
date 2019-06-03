import java.io.FileOutputStream;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

/**
 * @author yuyz
 * @date 2019-03-21 14:23
 */
public class FileLocking {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("E:\\ThinkingJava\\io\\src\\read");
        /*
         *对FileChannel调用tryLock()或lock(),就可以获得整个文件的FileLock
         *tryLock()是非阻塞式锁,它设法获取锁,但是如果不能获得(当其他一些进程已经持有相同的锁,并且不共享时),他将直接从方法调用返回
         * lock()则是阻塞式的,他要阻塞进程直至锁可以获得,或调用lock()的线程中断,或调用lock()的通道关闭.
         * FileLock.release()可以释放锁.
         */
        FileLock fl = fos.getChannel().tryLock();
        if(fl != null) {
            System.out.println("Locked file");
            TimeUnit.MILLISECONDS.sleep(10000);
            fl.release();
            System.out.println("Released Lock");
        }
        fos.close();

    }
}
