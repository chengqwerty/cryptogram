package som.cryptogram.main;

import java.util.Scanner;

public class SymmetricAESEncoderTest2 {

    public static void main(String[] args) {
        SymmetricAESEncoder symmetricAESEncoder = new SymmetricAESEncoder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用AES对称解密，请输入加密的规则：(须与加密相同)");
        String encodeRules = scanner.next();
        System.out.println("请输入要解密的内容（密文）:");
        String content = scanner.next();
        System.out.println("根据输入的规则" + encodeRules + "解密后的明文是:" + symmetricAESEncoder.AESDncode(encodeRules, content));
    }
}
