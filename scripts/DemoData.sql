INSERT INTO my2base.Customers (CustomerName, ContactName, Address, City, PostalCode, Country) 
						VALUE ('Alfreds Futterkiste',	'Maria Anders',	'Obere Str. 57',	'Berlin',	12209,	'Germany'),
								('Ana Trujillo Emparedados y helados',	'Ana Trujillo',	'Avda. de la Constitución 2222',	'México D.F.',
								05021,	'Mexico'),
								('Antonio Moreno Taquería',	'Antonio Moreno',	'Mataderos 2312',	'México D.F.',	05023,	'Mexico'),
								('Around the Horn', 'Thomas Hardy',	'120 Hanover Sq.',	'London',	'WA1 1DP',	'UK'),
								('Berglunds snabbköp',	'Christina Berglund',	'Berguvsvägen 8',	'Luleå',	'S-958 22',	'Sweden');
						
INSERT INTO my2base.Categories (CategoryName, Description) 
						VALUE ('Beverages',	'Soft drinks, coffees, teas, beers, and ales'),
								('Condiments',	'Sweet and savory sauces, relishes, spreads, and seasonings'),
								('Confections',	'Desserts, candies, and sweet breads'),
								('Dairy', 'Products	Cheeses'),
								('Grains/Cereals',	'Breads, crackers, pasta, and cereal');
						
INSERT INTO my2base.Employees (LastName, FirstName, BirthDate, Photo, Notes) 
						VALUE ('Davolio',	'Nancy',	'1968-12-08',	'EmpID1.pic',	'Education includes a BA in psychology from Colorado State University.
																		She also completed (The Art of the Cold Call). Nancy is a member of 
																		Toastmasters International'),
							('Fuller',	'Andrew',	'1952-02-19',	'EmpID2.pic',	'Andrew received his BTS commercial and a Ph.D. in international
																			marketing from the University of Dallas. He is fluent in French
																			and Italian and reads German. He joined the company as a sales 
																			representative, was promoted to sales manager and was then named
																			vice president of sales. Andrew is a member of the Sales Management
																			Roundtable, the Seattle Chamber of Commerce, and the Pacific Rim
																			Importers Association.'),
							('Leverling',	'Janet',	'1963-08-30',	'EmpID3.pic',	'Janet has a BS degree in chemistry from Boston College. She has also
																		completed a certificate program in food retailing management. Janet
																		was hired as a sales associate and was promoted to sales representative.'),
							('Peacock',	'Margaret',	'958-09-19',	'EmpID4.pic',	'Margaret holds a BA in English literature from Concordia College and
																			an MA from the American Institute of Culinary Arts. She was
																			temporarily assigned to the London office before returning to her
																			permanent post in Seattle.'),
							('Buchanan',	'Steven',	'1955-03-04',	'EmpID5.pic',	'Steven Buchanan graduated from St. Andrews University, Scotland, with
																		a BSC degree. Upon joining the company as a sales representative, he
																		spent 6 months in an orientation program at the Seattle office and then
																		returned to his permanent post in London, where he was promoted to sales
																		manager. Mr. Buchanan has completed the courses Successful Telemarketing
																		and International Sales Management. He is fluent in French.');
						
INSERT INTO my2base.Suppliers (SupplierName, ContactName, Address, City, PostalCode, Country, Phone) 
						VALUES ('Exotic Liquid',	'Charlotte Cooper',	'49 Gilbert St.',	'Londona',	'EC1 4SD',	'UK',	'(171) 555-2222'),
								('New Orleans Cajun Delights',	'Shelley Burke',	'P.O. Box 78934',	'New Orleans',	70117,	'USA',	'(100) 555-4822'),
								('Grandma Kellys Homestead',	'Regina Murphy',	'707 Oxford Rd.',	'Ann Arbor',	48104,	'USA',	'(313) 555-5735'),
								('Tokyo Traders',	'Yoshi Nagase',	'9-8 Sekimai Musashino-shi',	'Tokyo',	100,	'Japan',	'(03) 3555-5011'),
								('Cooperativa de Quesos Las Cabras',	'Antonio del Valle Saavedra',	'Calle del Rosal 4',
								 'Oviedo',	33007,	'Spain',	'(98) 598-76-54');
						
INSERT INTO my2base.Shippers (ShipperName,Phone) 
						VALUES ('Speedy Express',	'(503) 555-9831'),
								('United Package',	'(503) 555-3199'),
								('Federal Shipping',	'(503) 555-9931');
						
INSERT INTO my2base.Products (ProductName, SupplierID, CategoryID, Unit, Price) 
					VALUES ('Chais',	1,	1,	'10 boxes x 20 bags',	18),
							('Chang',	1,	1,	'24 - 12 oz bottles',	19),
							('Aniseed Syrup',	1,	2,	'12 - 550 ml bottles',	10),
							('Chef Antons Cajun Seasoning',	2,	2,	'48 - 6 oz jars',	22),
							('Chef Antons Gumbo Mix',	2,	2,	'36 boxes',	21.35);
					
INSERT INTO my2base.Orders (CustomerID, EmployeeID,	OrderDate, ShipperID) 
					VALUES (4,	2,	'1996-07-04',	3),
							(3,	5,	'996-07-05',	1),
							(2,	4,	'1996-07-08',	2),
							(5,	3,	'1996-07-08',	3),
							(2,	1,	'1996-07-09',	2);
					
INSERT INTO my2base.OrderDetails (OrderID, ProductID, Quantity) 
						VALUE (1,	3,	12),
								(1,	2,	10),
								(1,	1,	5),
								(2,	5,	9),
								(2,	4,	40);