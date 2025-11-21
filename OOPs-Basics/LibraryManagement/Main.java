// package LibraryManagement;
import java.util.*;

class Book
{
    String name;
    int id;
    String author;
    int copies;
    Book(String name, int id, String author,int copies)
    {
        this.name = name;
        this.id = id;
        this.author = author;
        this.copies = copies;
    }
    public int getCopies()
    {
        return copies;
    }
    public String getName()
    {
        return this.name;
    }
    public int getId()
    {
        return this.id;
    }
    public String getAuthor()
    {
        return this.author;
    }
    public void setName(String n1)
    {
        this.name = n1;
    }
    public void setId(int id1)
    {
        this.id = id1;
    }
    public void setAuthor(String a1)
    {
        this.author = a1;
    }
    public void setCopies(int cp)
    {
        this.copies = cp;
    }
}


abstract class LibraryManager
{
    abstract void addBook(Book b);
    abstract void showBooks();
    abstract void borrowBook(Book b);
    abstract void returnBook(Book b);
    abstract void updateCopiesBook(int id, int copies);
}

class Library extends LibraryManager
{
    String name;
    Map<Integer,Book> books = new TreeMap<>();
    int year;
    Library(String name, Map<Integer,Book> books, int year)
    {
        this.name = name;
        this.books = books;
        this.year = year;
    }
    public String getName()
    {
        return this.name;
    }
    public Map<Integer,Book> getBooks()
    {
        return this.books;
    }
    public int getYear()
    {
        return this.year;
    }
    public void setName(String n1)
    {
        this.name = n1;
    }
    public void setYear(int y1)
    {
        this.year = y1;
    }

    @Override
    void addBook(Book b)
    {
        books.put(b.getId(), b);
    }

    @Override
    void showBooks()
    {
        for(Integer id : books.keySet())
        {
            Book b = books.get(id);
            System.out.println("Name of the book is "+ b.getName() + " the book is by "+b.getAuthor() + " the id is "+ b.getId() + " the number of copies are "+b.getCopies());
        }
    }
    @Override
    void updateCopiesBook(int id, int copy)
    {
        if(!books.containsKey(id))
        {
            System.out.println(" Not contains");
        }
        else
        {
            Book b = books.get(id);
            b.copies = copy;

        }
    }
    @Override
    void borrowBook(Book b)
    {
        if (b.getCopies() > 0)
        {
            b.setCopies(b.getCopies() - 1);
        if (b.getCopies() == 0) books.remove(b.getId());
        }
        else
        {
            System.out.println("No copies available");
        }
    }
    @Override
    void returnBook(Book b)
    {
        if(books.containsKey(b.getId())) b.copies++;
        else books.put(b.getId(), b);
    }
}

public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the books");
        System.out.println("In the first input type done or continue for finishing or continuing it");
        Map<Integer , Book> books = new TreeMap<>();
        Library library = new Library("NYC Library" , books, 1998);
        while (true)
        {
            System.out.println("Enter done or continue");
            String ops = sc.nextLine();
            if (ops.equalsIgnoreCase("done")) break;

            System.out.println("Enter book name : ");
            String name = sc.nextLine();

            System.out.println("Enter author: ");
            String author = sc.nextLine();

            System.out.println("Enter id: ");
            int id = Integer.parseInt(sc.nextLine());
            boolean flag = true;
            if(library.getBooks().containsKey(id)) 
            {
                System.out.println("Enter Valid Id");
                flag = false;
                continue;
            }
            System.out.println("Enter number of copies: ");
            int copies = Integer.parseInt(sc.nextLine());

            Book b = new Book(name, id, author ,copies);
            if(flag) books.put(b.getId(), b);
        }
        System.out.println(" Now comes the Menu of library");
        System.out.println(" 1 for adding, 2 for borrowing, 3 for returning books, 4 for showing Books");
        System.out.println(" 5 for availablity, 6 for updating copies ,7 for exit");
        while(true)
        {
            int done = Integer.parseInt(sc.nextLine());
            if(done == 7) break;
            if(done == 1)
            {
                System.out.println("Enter name,author, id and copies");
                String name,author;
                int id,copies;
                name = sc.nextLine();
                author = sc.nextLine();
                id = Integer.parseInt(sc.nextLine());
                copies = Integer.parseInt(sc.nextLine());
                Book b = new Book(name,id,author,copies);
                library.addBook(b);
                System.out.println("added");
            }
            if(done == 2)
            {
                System.out.println("Enter the id");
                int id = Integer.parseInt(sc.nextLine());
                if(!library.getBooks().containsKey(id)) System.out.println("Enter valid id");
                else 
                {
                    Book b = library.getBooks().get(id);
                    library.borrowBook(b);
                }
                System.out.println("Borrowed");
            }
            if(done == 3)
            {
                System.out.println("Enter name,author and id");
                String name,author;
                int id,copies;
                name = sc.nextLine();
                author = sc.nextLine();
                id = Integer.parseInt(sc.nextLine());
                Book b = new Book(name,id,author,1);
                if(library.getBooks().containsKey(id)) 
                {
                    library.getBooks().get(id).copies++;
                } 
                else 
                {
                    library.returnBook(b);
                }
            }
            if(done == 4)
            {
                library.showBooks();
            }
            if(done == 5)
            {
                System.out.println("Enter the id of the book");
                int id = Integer.parseInt(sc.nextLine());
                if(library.getBooks().containsKey(id)) System.out.println("Yes");
                else System.out.println("No");
            }
            if(done == 6)
            {
                System.out.println("Enter the id of the book and the copies to update");
                int id,copies;
                id = Integer.parseInt(sc.nextLine());
                copies = Integer.parseInt(sc.nextLine());
                if(! library.getBooks().containsKey(id)) System.out.println("Enter valid id");
                else library.updateCopiesBook(id,copies);
            }
        }
        sc.close();
    }


}