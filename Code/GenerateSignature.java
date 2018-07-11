GenerateSignature

package com.ack.security;

import java.io.FileInputStream;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;

import com.ack.security.ByteUtils;

/* Gerar uma assinatura DSA */

class GenerateSignature {

  public static void main( String[] args ) throws Exception {

    //  gerador de chaves DSA implementado pelo SUN
    System.out.println( "Obter o gerador de par de chaves..." );
    java.security.KeyPairGenerator keyGen = java.security.KeyPairGenerator.getInstance( "DSA", "SUN" );

    // randomizar baseado em SHA para SUN
    java.security.SecureRandom random = java.security.SecureRandom.getInstance( "SHA1PRNG", "SUN" );
    keyGen.initialize( 1024, random );

    // criar um par de chaves
    java.security.KeyPair pair = keyGen.generateKeyPair();
    java.security.PrivateKey priv = pair.getPrivate();
    java.security.PublicKey pub = pair.getPublic();

    System.out.println( "## par de chaves gerado..." );

    // criar uma assinatura baseada em SHA com DSA implementada pelo SUN
    java.io.FileInputStream fis = new java.io.FileInputStream( "hello.txt" );
    byte[] realSig = SignatureUtil.signData( fis, priv );

    System.out.println( "## informacao assinada..." );

    // saida do arquivo assinado
    com.ack.security.ByteUtils.saveBytesToFile( "hello.sig", realSig );
    System.out.println( "## salvar arquivo assinado em hello.sign ..." );

    // salvando a chave publica também
    com.ack.security.ByteUtils.saveBytesToFile( "hello.pubkey", pub.getEncoded() );
    System.out.println( "## salvando chave publica para hello.pubkey" );

    System.out.println( "Pronto!" );
  }
}