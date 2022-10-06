public class Main {

            public static void main(String[] args) {


                Author MartinRobert = new Author("Мартин", "Роберт");
                Author BertBeits = new Author("Берт", "Бейтс");

                Book cleanCode = new Book("Clean code", 2013, MartinRobert);
                Book learnJava = new Book("Learn Java", 2003, BertBeits);

                System.out.println("Название книги: "+cleanCode.getTitle()+" Дата: "+cleanCode.getPublisherAge()+" Автор: "+cleanCode.getAuthor().getFullName());

                System.out.println("Название книги: "+learnJava.getTitle()+" Дата: "+learnJava.getPublisherAge()+" Автор: "+learnJava .getAuthor().getFullName());

                System.out.println(MartinRobert);
                System.out.println(BertBeits);
                System.out.println(cleanCode);
                System.out.println(learnJava);

                System.out.println(MartinRobert.equals(BertBeits));
                System.out.println(MartinRobert.equals(MartinRobert));
                System.out.println(cleanCode.equals(learnJava));
                System.out.println(cleanCode.equals(cleanCode));

            }
        }

