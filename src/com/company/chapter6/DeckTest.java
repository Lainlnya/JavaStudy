package com.company.chapter6;

public class DeckTest
{
    public static void main(String[] args)
    {
        Deck d = new Deck(); //이렇게 생성자로 Deck을 생성해야 랜덤값이 들어간다.
        Card c = d.pick(0);
        System.out.println(c);

        d.shuffle();
        c = d.pick();
        System.out.println(c);
    }
}

class Deck
{
    final int CARD_NUM = 52;
    Card cardArr[] = new Card[CARD_NUM]; //포함관계로 Card클래스 사용

    Deck()
    {
        int i = 0;
        for(int k = Card.KIND_NUM; k > 0; k--)
            for(int n = 0; n < Card.NUM_MAX; n++)
                cardArr[i++] = new Card(k, n+1);
    }
    Card pick(int index)
    {
        return cardArr[index];
    }
    Card pick()
    {
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }

    void shuffle()
    {
        for(int i = 0; i < cardArr.length; i++)
        {
            int r = (int)(Math.random() * CARD_NUM);
            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }

}

class Card {
    static final int KIND_NUM = 4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card()
    {
        this(SPADE, 1);
    }
    Card(int kind, int number)
    {
        this.kind = kind;
        this.number = number;
    }
    public String toString()
    {
        String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
        String numbers = "0123456789JQK";
        return "kind : " + kinds[this.kind] + "  number : "+numbers.charAt(this.number);
    }
}