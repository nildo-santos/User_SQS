package br.com.nildosantos.components;

import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

@Component
public class CryptoComponent {

    /*
        Método para criptografar um valor usando
        o algoritmo SHA 256 (HASH)
     */
    public String sha256(String value) {
        try {
            // Instanciando o algoritmo SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Gerando o hash
            byte[] hash = digest.digest(value.getBytes(StandardCharsets.UTF_8));

            // Convertendo de bytes para string hexadecimal
            StringBuilder hex = new StringBuilder();
            for (byte b : hash) {
                hex.append(String.format("%02x", b));
            }

            return hex.toString();

        } catch (Exception e) {
            throw new RuntimeException("Erro ao gerar hash SHA-256", e);
        }
    }
}

