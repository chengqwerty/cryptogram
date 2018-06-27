package som.cryptogram.main;

import org.junit.Test;

import java.util.Scanner;

public class SymmetricAESEncoderTest1 {

    public static void main(String[] args) {
        SymmetricAESEncoder symmetricAESEncoder = new SymmetricAESEncoder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用AES对称加密，请输入加密的规则");
        String encodeRules = scanner.next();
        System.out.println("请输入要加密的内容:");
        String content = scanner.next();
        System.out.println("根据输入的规则" + encodeRules + "加密后的密文是:" + symmetricAESEncoder.AESEncode(encodeRules, content));
    }

}
