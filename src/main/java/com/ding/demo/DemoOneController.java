package com.ding.demo;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created  by DHui (Tel:7490) on 2021/7/31.
 */
public class DemoOneController {
    public static byte[] bb = new byte[1024];
    public static List<DemoOneController> listsss = new ArrayList();
    public static void main(String[] args) throws IOException, InterruptedException {


        System.out.println(8&12);


//
//
//
//        ThreadLocal threadLocal = new ThreadLocal();
//        threadLocal.set(1);
//
//        Lock lock = new ReentrantLock();
//        lock.lock();
//
//
//        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
//
//        concurrentHashMap.put(1,33);
//        concurrentHashMap.put(2,33);
//        concurrentHashMap.put(3,33);
//        concurrentHashMap.put(4,33);
//        concurrentHashMap.put(5,33);
//        concurrentHashMap.put(6,33);
//        concurrentHashMap.put(7,33);
//        concurrentHashMap.put(8,33);
//        concurrentHashMap.put(9,33);
//        concurrentHashMap.put(10,33);
//        concurrentHashMap.put(11,33);
//        concurrentHashMap.put(12,33);
//
        HashMap map = new HashMap();
        map.put("11",11);
        map.put("11",22);
        map.get("11");
        map.entrySet().iterator();
//
//
//        LinkedList linkedList = new LinkedList();
//        linkedList.add(111);
//        linkedList.add(222);
//        linkedList.add(333);
//
//        Iterator iterator = linkedList.iterator();
//        while(iterator.hasNext()){
//            Integer i = (Integer) iterator.next();
//            System.out.println(i);
//        }
//
//
//        StringBuffer stringBuffer   = new StringBuffer();
//        stringBuffer.append("");
//
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(11);
//
//        List list = Collections.synchronizedList(arrayList);
//        list.add(1211);
//        arrayList.remove(1);
//        Iterator  iterator1 = arrayList.iterator();
//        while (iterator1.hasNext()){
//            iterator1.next();
//
//        }
//
//        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList<>();
//
//        copyOnWriteArrayList.add(11);
//
////        ThreadLocal threadLocal = new ThreadLocal();
//        Hashtable hashtable= new Hashtable();
//        HashMap hashMap = new HashMap();
//        System.setProperty("dh", "dinghui");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("srping-ev.xml","spring-dinghui.xml");
//
////
//        ReentrantLock reentrantLock = new ReentrantLock();
//        reentrantLock.lock();
//        reentrantLock.unlock();
//
//        while (true){
//            listsss.add(new DemoOneController());
//        }


        /*

        ByteBuffer byteBuffer = ByteBuffer.allocate(11);
        ByteBuffer.allocateDirect(111);
        String str = "abcd";
        byteBuffer.put(str.getBytes());

        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());
        byteBuffer.flip();
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());
        byte[] dst = new byte[byteBuffer.limit()];
        byteBuffer.get(dst,0,1);
        byteBuffer.mark();
        System.out.println(byteBuffer.position());
        System.out.println(byteBuffer.limit());
        System.out.println(byteBuffer.capacity());

        byteBuffer.reset();
        System.out.println(byteBuffer.position());

*/


//
//        Map map = new HashMap<>();
//        map.put(1,1);
//        DemoOneController demoOneController = new DemoOneController();
//        List list   = new ArrayList();
//        while (true){
//            list.add(new DemoOneController());
//        }
//        List list = new  ArrayList();
//        list.remove(1);
//        List list1 = new LinkedList();

//
//        int[] i = new int[10];
//        i[0] = 1;
//        System.out.println(i.length+"====");
//
//        List list2 = new ArrayList(22);
//        list2.add(11);
//        list2.add(12);
//        list2.add(13);
//        List list = new  ArrayList(list2);
//        list.add(2);
//        System.out.println(list.size());

//        System.out.println(System.getProperty("sun.boot.class.path"));
//        System.out.println(System.getProperty("java.ext.dirs"));
//        System.out.println(System.SystemgetProperty("java.class.path"));
    }

    @Test
    public void test1() throws IOException {
        FileInputStream fileInputStrea = new FileInputStream("D:\\顶岗实习协议模板（旅外系）.doc");
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\顶岗实习协议模板.doc");
        ByteBuffer byteBuffer  = ByteBuffer.allocate(1024);

        FileChannel inChannel = fileInputStrea.getChannel();
        FileChannel outChannel = fileOutputStream.getChannel();
        while (inChannel.read(byteBuffer) !=-1){
            byteBuffer.flip();
            outChannel.write(byteBuffer);
            byteBuffer.clear();
        }
        inChannel.close();
        outChannel.close();
        fileInputStrea.close();
        fileOutputStream.close();
    }
}
