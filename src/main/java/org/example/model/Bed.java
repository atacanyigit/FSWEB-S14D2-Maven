package org.example.model;

public class Bed {
    // Testlerin ve Bedroom'un beklediği sıralamaya göre field'lar
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    // 1. DÜZELTME: Constructor parametre sırası
    // Testler genellikle (style, pillows, height, sheets, quilt) bekler
    // veya senin mevcut sıranı (height, pillows...) kullanacaksan MainTest'teki 'new Bed' satırını buna uydurmalısın.
    // Ancak testlerin hatasız geçmesi için standart sıra şudur:
    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("The bed is being made."); // Küçük bir yazım hatası düzeltildi: 'bad' -> 'bed'
    }

    // 2. DÜZELTME: Metot İsimleri (Getter)
    // Hata mesajında "cannot find symbol: getQuilts()" yazıyor.
    // Bu, testin metodu çoğul (s takısıyla) beklediği anlamına gelir.

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public int getQuilts() { // getQuilt -> getQuilts yapıldı
        return quilt;
    }

    public int getSheets() {
        return sheets;
    }

    public String getStyle() {
        return style;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "style='" + style + '\'' +
                ", pillows=" + pillows +
                ", height=" + height +
                ", sheets=" + sheets +
                ", quilt=" + quilt +
                '}';
    }
}