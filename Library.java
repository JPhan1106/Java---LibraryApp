package bookStore;

public class Library {
	public static void main(String[] args) {

		// Define books
		Book book1 = new Book();
		book1.name = "Love Your Life";
		book1.ISBN = 1234;
		book1.author = "Alex Chen";

		Book book2 = new Book();
		book2.name = "Death In The Universe";
		book2.ISBN = 1235;
		book2.author = "Max May";

		Book book3 = new Book();
		book3.name = "I Love Everything About You";
		book3.ISBN = 1244;
		book3.author = "Tony Thomas";

		Book book4 = new Book();
		book4.name = "A Laugh";
		book4.ISBN = 1234;
		book4.author = "Phil Bob";

		Book[] books = { book1, book2, book3, book4 };

		// Define genres
		Genre romance = new Genre();
		romance.id = 1;
		romance.name = "Romance";

		Genre education = new Genre();
		education.id = 2;
		education.name = "Education";

		Genre science = new Genre();
		science.id = 3;
		science.name = "Science";

		Genre selfhelp = new Genre();
		selfhelp.id = 3;
		selfhelp.name = "Self-help";

		// Define genres of each book;
		GenreOfBook book1Romance = new GenreOfBook();
		book1Romance.book = book1;
		book1Romance.genre = romance;

		GenreOfBook book1Selfhelp = new GenreOfBook();
		book1Selfhelp.book = book1;
		book1Selfhelp.genre = selfhelp;

		GenreOfBook book2Science = new GenreOfBook();
		book2Science.book = book2;
		book2Science.genre = science;

		GenreOfBook book2Education = new GenreOfBook();
		book2Education.book = book2;
		book2Education.genre = education;

		GenreOfBook book3Romance = new GenreOfBook();
		book1Romance.book = book3;
		book1Romance.genre = romance;

		GenreOfBook book4Education = new GenreOfBook();
		book4Education.book = book4;
		book4Education.genre = education;

		GenreOfBook book4Science = new GenreOfBook();
		book4Science.book = book4;
		book4Science.genre = science;

		GenreOfBook book4Selfhelp = new GenreOfBook();
		book4Selfhelp.book = book4;
		book4Selfhelp.genre = selfhelp;

		GenreOfBook[] genreofbooks = { book1Romance, book1Selfhelp, book2Science, book2Education, book3Romance,
				book4Education, book4Science, book4Selfhelp };

		// Define locations
		Location sydney = new Location();
		sydney.id = 2000;
		sydney.name = "Sydney";
		sydney.address = "somewhere in Sydney";

		Location melbourne = new Location();
		melbourne.id = 3000;
		melbourne.name = "Melbourne";
		melbourne.address = "somewhere in Melbourne";

		Location adelaide = new Location();
		adelaide.id = 2000;
		adelaide.name = "Adelaide";
		adelaide.address = "somewhere in Adelaide";

		Location[] locations = { sydney, melbourne, adelaide };

		// Define stock in each location
		StockInLocation book1InSydney = new StockInLocation();
		book1InSydney.book = book1;
		book1InSydney.location = sydney;
		book1InSydney.stock = 20;

		StockInLocation book1InMelbourne = new StockInLocation();
		book1InMelbourne.book = book1;
		book1InMelbourne.location = melbourne;
		book1InMelbourne.stock = 20;

		StockInLocation boo21InMelbourne = new StockInLocation();
		book1InMelbourne.book = book2;
		book1InMelbourne.location = melbourne;
		book1InMelbourne.stock = 30;

		StockInLocation book3InAdelaide = new StockInLocation();
		book3InAdelaide.book = book3;
		book3InAdelaide.location = adelaide;
		book3InAdelaide.stock = 12;

		StockInLocation book3InMelbourne = new StockInLocation();
		book1InMelbourne.book = book3;
		book1InMelbourne.location = melbourne;
		book1InMelbourne.stock = 10;

		StockInLocation book4InSydney = new StockInLocation();
		book4InSydney.book = book4;
		book4InSydney.location = sydney;
		book4InSydney.stock = 10;

		StockInLocation book4InAdelaide = new StockInLocation();
		book4InAdelaide.book = book4;
		book4InAdelaide.location = adelaide;
		book4InAdelaide.stock = 8;

		StockInLocation book4InMelbourne = new StockInLocation();
		book4InMelbourne.book = book4;
		book4InMelbourne.location = melbourne;
		book4InMelbourne.stock = 5;

		StockInLocation[] stockInLocations = { book1InSydney, book1InMelbourne, boo21InMelbourne, book3InAdelaide,
				book3InMelbourne, book4InSydney, book4InAdelaide, book4InMelbourne };

		// Define Customers
		Customer customer1 = new Customer();
		customer1.id = 987;
		customer1.name = "Customer 1";

		Customer customer2 = new Customer();
		customer2.id = 988;
		customer2.name = "Customer 2";

		Customer customer3 = new Customer();
		customer3.id = 989;
		customer3.name = "Customer 3";

		Customer customer4 = new Customer();
		customer4.id = 977;
		customer4.name = "Customer 4";

		Customer[] customers = { customer1, customer2, customer3, customer4 };

		// Define borrow history;
		BorrowHistory customer1Book1 = new BorrowHistory();
		customer1Book1.customer = customer1;
		customer1Book1.book = book1;
		customer1Book1.borrowDate = "01/04/2023";
		customer1Book1.isReturned = false;

		BorrowHistory customer1Book2 = new BorrowHistory();
		customer1Book2.customer = customer1;
		customer1Book2.book = book2;
		customer1Book2.borrowDate = "01/04/2023";
		customer1Book2.isReturned = true;
		customer1Book2.returnDate = "10/04/2023";

		BorrowHistory customer1Book3 = new BorrowHistory();
		customer1Book3.customer = customer1;
		customer1Book3.book = book2;
		customer1Book3.borrowDate = "01/04/2022";
		customer1Book3.isReturned = false;

		BorrowHistory customer2Book1 = new BorrowHistory();
		customer2Book1.customer = customer2;
		customer2Book1.book = book1;
		customer2Book1.borrowDate = "12/04/2022";
		customer2Book1.isReturned = true;
		customer2Book1.returnDate = "15/04/2023";

		BorrowHistory customer2Book4 = new BorrowHistory();
		customer2Book4.customer = customer2;
		customer2Book4.book = book4;
		customer2Book4.borrowDate = "15/04/2022";
		customer2Book4.isReturned = true;
		customer2Book4.returnDate = "22/04/2023";

		BorrowHistory customer3Book3 = new BorrowHistory();
		customer3Book3.customer = customer3;
		customer3Book3.book = book3;
		customer3Book3.borrowDate = "01/02/2022";
		customer3Book3.isReturned = true;
		customer3Book3.returnDate = "20/03/2022";

		BorrowHistory customer3Book1 = new BorrowHistory();
		customer3Book1.customer = customer3;
		customer3Book1.book = book1;
		customer3Book1.borrowDate = "01/02/2022";
		customer3Book1.isReturned = false;

		BorrowHistory customer3Book4 = new BorrowHistory();
		customer3Book4.customer = customer3;
		customer3Book4.book = book4;
		customer3Book4.borrowDate = "01/04/2022";
		customer3Book4.isReturned = false;

		BorrowHistory customer4Book4 = new BorrowHistory();
		customer4Book4.customer = customer4;
		customer4Book4.book = book4;
		customer4Book4.borrowDate = "23/04/2023";
		customer4Book4.isReturned = false;

		BorrowHistory[] borrowHistorys = { customer1Book1, customer1Book2, customer1Book3, customer2Book1,
				customer2Book4, customer3Book3, customer3Book1, customer3Book4, customer4Book4 };

		// print all borrow list
		getAllBorrowList(customers, borrowHistorys);

		// print status of a book
		getBorrowReturnStatusOfAbook(books, borrowHistorys);

	}

	// Function to print all borrow list
	public static void getAllBorrowList(Customer[] customers, BorrowHistory[] borrowHistorys) {
		for (Customer customer : customers) {
			System.out.println("Borrow list of " + customer.name + ":");
			for (BorrowHistory borrowHistory : borrowHistorys) {
				if (borrowHistory.customer == customer && borrowHistory.isReturned == true) {
					System.out.println(borrowHistory.book.name + " --- Borrow date: " + borrowHistory.borrowDate
							+ " --- Return date: " + borrowHistory.returnDate);
				} else if (borrowHistory.customer == customer && borrowHistory.isReturned == false) {
					System.out.println(borrowHistory.book.name + " --- Borrow date: " + borrowHistory.borrowDate
							+ " --- Has yet been returned");
				}
			}
			System.out.println("\n");
		}
	}

	// Function to print borrow and return status of a book
	public static void getBorrowReturnStatusOfAbook(Book[] books, BorrowHistory[] borrowHistorys) {
		for (Book book : books) {
			System.out.println("Borrow and return status of: " + book.name + ": ");
			for (BorrowHistory status : borrowHistorys) {
				if (status.book == book) {
					if (status.isReturned == true) {
						System.out.println("Customer: " + status.customer.name + " --- Borrow date: "
								+ status.borrowDate + " --- Return date: " + status.returnDate);
					} else {
						System.out.println("Customer: " + status.customer.name + " --- Borrow date: "
								+ status.borrowDate + " --- Has yet been returned");
					}
				}
			}
			System.out.println("\n");
		}
	}

}
