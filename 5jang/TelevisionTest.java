// public class TelevisionTest {
//     public static void main(String[] args) {
//         Television tv = new Television();
//         tv.channel = 7;
//         tv.volume = 9;
//         tv.onOff = true;

//         System.out.println("텔레비전의 채널은 " + tv.channel + "이고 볼륨은 " 
//         + tv.volume + " 입니다.");
//     }
// }

// -------------------------------------------------------------------------

// public class TelevisionTest {
//     public static void main(String[] args) {
//         Television myTv = new Television();
//         myTv.channel = 7;
//         myTv.volume = 9;
//         myTv.onOff = true;
        
//         Television yourTv = new Television();
//         yourTv.channel = 9;
//         yourTv.volume = 12;
//         yourTv.onOff = true;

//         System.out.println("텔레비전의 채널은 " + myTv.channel + "이고 볼륨은 " 
//         + myTv.volume + " 입니다.");

//         System.out.println("텔레비전의 채널은 " + yourTv.channel + "이고 볼륨은 " 
//         + yourTv.volume + " 입니다.");

//     }
// }

// -------------------------------------------------------------------------

// public class TelevisionTest {
//     public static void main(String[] args) {
//         Television myTv = new Television();
//         myTv.channel = 7;
//         myTv.volume = 9;
//         myTv.onOff = true;
//         myTv.print();

//         Television yourTv = new Television();
//         yourTv.channel = 9;
//         yourTv.volume = 12;
//         yourTv.onOff = true;
//         yourTv.print();

//     }
// }

// -------------------------------------------------------------------------

// public class TelevisionTest {
//     public static void main(String[] args) {
//         Television myTv = new Television();
//         myTv.channel = 7;
//         myTv.volume = 9;
//         myTv.onOff = true;
//         int ch = myTv.getChannel();
//         System.out.println("현재 채널은 " + ch + "입니다.");

//     }
// }

// -------------------------------------------------------------------------

public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television();
        
        myTv.setChannel(11);
        int ch = myTv.getChannel();
        System.out.println("현재 채널은 " + ch + "입니다.");

    }
}