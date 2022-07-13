package br.com.gen.Atv04;

import org.w3c.dom.ls.LSOutput;

public class Ex01 {
  //Crie uma classe cliente e apresente os atributos e métodos referentes
  //esta classe, em seguida crie um objeto cliente, defina as instancias deste
  //objeto e apresente as informações deste objeto no console.

  public static void main(String[] args) {
    Ex01Cliente cliente01 = new Ex01Cliente("Fernando", 24);
    System.out.println(cliente01.getNome() + ", " + cliente01.getIdade());
  }
}