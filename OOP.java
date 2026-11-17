class Book {
    private String title;
    private int pages;
    private double price;

    public Book(String title, int pages, double price) {
        setPages(pages);
        setPrice(price);
        setTitle(title);
    }

    public String getTitle() {return title;}
    public int getPages() {return pages;}
    public double getPrice() {return price;}

    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Ошибка: название не может быть пустым");
            this.title = "Неизвестно";
        }
        else {this.title = title;}
    }
    public void setPages (int pages) {
        if (pages < 1) { System.out.println("Ошибка: страниц должно быть больше 0");
            this.pages = 1;
        }
        else { this.pages = pages;}
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Ошибка: цена не может быть отрицательной");
            this.price = 0.0;
        }
        else { this.price = price;}
    }

    public void printInfo() {
        System.out.println("Книга: "+title+", Страниц: "+pages+", Цена: "+price);
    }
}


public class OOP {
    public static void main(String[] args) {
        Book first = new Book ("", -5, -100);
        first.printInfo();
        Book second = new Book ("Собачка гав-гав", 67, 90);
        second.printInfo();
    }
}