USE [master]
GO
/****** Object:  Database [ComputerStore]    Script Date: 9/8/2016 9:14:40 AM ******/
CREATE DATABASE [ComputerStore]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'ComputerStore', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\ComputerStore.mdf' , SIZE = 3136KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'ComputerStore_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL11.SQLEXPRESS\MSSQL\DATA\ComputerStore_log.ldf' , SIZE = 832KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [ComputerStore] SET COMPATIBILITY_LEVEL = 110
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [ComputerStore].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [ComputerStore] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [ComputerStore] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [ComputerStore] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [ComputerStore] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [ComputerStore] SET ARITHABORT OFF 
GO
ALTER DATABASE [ComputerStore] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [ComputerStore] SET AUTO_CREATE_STATISTICS ON 
GO
ALTER DATABASE [ComputerStore] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [ComputerStore] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [ComputerStore] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [ComputerStore] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [ComputerStore] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [ComputerStore] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [ComputerStore] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [ComputerStore] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [ComputerStore] SET  ENABLE_BROKER 
GO
ALTER DATABASE [ComputerStore] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [ComputerStore] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [ComputerStore] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [ComputerStore] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [ComputerStore] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [ComputerStore] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [ComputerStore] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [ComputerStore] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [ComputerStore] SET  MULTI_USER 
GO
ALTER DATABASE [ComputerStore] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [ComputerStore] SET DB_CHAINING OFF 
GO
ALTER DATABASE [ComputerStore] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [ComputerStore] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
USE [ComputerStore]
GO
/****** Object:  StoredProcedure [dbo].[SelectAllOrder]    Script Date: 9/8/2016 9:14:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[SelectAllOrder]
AS
BEGIN
	SELECT * FROM [dbo].[Order]
END

GO
/****** Object:  StoredProcedure [dbo].[SelectAllProduct]    Script Date: 9/8/2016 9:14:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date,,>
-- Description:	<Description,,>
-- =============================================
CREATE PROCEDURE [dbo].[SelectAllProduct]
AS
BEGIN
	select Pro_ID,Pro_Name,Pro_Photo,Pro_Price,c.Gro_ID,Gro_Name,b.Sup_ID,Sup_Name from [ComputerStore].[dbo].[Product]
                a join [ComputerStore].[dbo].[Supplier] b on a.Sup_ID=b.Sup_ID join [ComputerStore].[dbo].[ProGroups] c on a.Gro_ID=c.Gro_ID

END

GO
/****** Object:  Table [dbo].[Admin]    Script Date: 9/8/2016 9:14:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Admin](
	[UserName] [varchar](50) NOT NULL,
	[PassWord] [varchar](50) NOT NULL,
	[Status] [tinyint] NOT NULL,
 CONSTRAINT [PK_Admin] PRIMARY KEY CLUSTERED 
(
	[UserName] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Order]    Script Date: 9/8/2016 9:14:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Order](
	[Ord_ID] [int] NOT NULL,
	[Cus_Name] [varchar](50) NOT NULL,
	[Cus_Address] [varchar](50) NOT NULL,
	[Cus_Email] [varchar](50) NOT NULL,
	[Cus_Mobile] [varchar](50) NOT NULL,
	[Ord_Time] [date] NOT NULL,
	[Staff_Ord] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Order] PRIMARY KEY CLUSTERED 
(
	[Ord_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 9/8/2016 9:14:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[Ord_ID] [int] NOT NULL,
	[Pro_ID] [int] NOT NULL,
	[Number] [int] NOT NULL,
	[Price] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Ord_ID] ASC,
	[Pro_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Position]    Script Date: 9/8/2016 9:14:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Position](
	[Pos_ID] [int] NOT NULL,
	[Pos_Name] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_Position] PRIMARY KEY CLUSTERED 
(
	[Pos_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Product]    Script Date: 9/8/2016 9:14:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Product](
	[Pro_ID] [int] NOT NULL,
	[Pro_Name] [varchar](50) NOT NULL,
	[Pro_Photo] [varchar](100) NOT NULL,
	[Pro_Price] [float] NOT NULL,
	[Gro_ID] [int] NOT NULL,
	[Sup_ID] [int] NULL,
 CONSTRAINT [PK_Table_1] PRIMARY KEY CLUSTERED 
(
	[Pro_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ProGroups]    Script Date: 9/8/2016 9:14:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[ProGroups](
	[Gro_ID] [int] NOT NULL,
	[Gro_Name] [varchar](50) NOT NULL,
 CONSTRAINT [PK_ProGroups] PRIMARY KEY CLUSTERED 
(
	[Gro_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Staff]    Script Date: 9/8/2016 9:14:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Staff](
	[Staff_ID] [int] NOT NULL,
	[UserS] [varchar](50) NOT NULL,
	[Pass] [varchar](50) NOT NULL,
	[FullName] [varchar](50) NOT NULL,
	[Birthday] [date] NOT NULL,
	[Mobile] [varchar](20) NOT NULL,
	[Address] [varchar](100) NOT NULL,
	[Gender] [varchar](10) NOT NULL,
	[Pos_ID] [int] NOT NULL,
 CONSTRAINT [PK_Staff] PRIMARY KEY CLUSTERED 
(
	[Staff_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Supplier]    Script Date: 9/8/2016 9:14:40 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Supplier](
	[Sup_ID] [int] NOT NULL,
	[Sup_Name] [varchar](50) NOT NULL,
	[Sup_Telephone] [varchar](20) NOT NULL,
 CONSTRAINT [PK_Supplier] PRIMARY KEY CLUSTERED 
(
	[Sup_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[Admin] ([UserName], [PassWord], [Status]) VALUES (N'Admin', N'123', 1)
INSERT [dbo].[Order] ([Ord_ID], [Cus_Name], [Cus_Address], [Cus_Email], [Cus_Mobile], [Ord_Time], [Staff_Ord]) VALUES (1, N'tung', N'xuan dinh', N'kechoplay2@gmail.com', N'01654684', CAST(0x583B0B00 AS Date), N'Messi')
INSERT [dbo].[Order] ([Ord_ID], [Cus_Name], [Cus_Address], [Cus_Email], [Cus_Mobile], [Ord_Time], [Staff_Ord]) VALUES (2, N'Son', N'132Thanh xuan', N'dasds', N'021685498123', CAST(0xF1390B00 AS Date), N'Fernando Tores')
INSERT [dbo].[Order] ([Ord_ID], [Cus_Name], [Cus_Address], [Cus_Email], [Cus_Mobile], [Ord_Time], [Staff_Ord]) VALUES (3, N'haha', N'123asd', N'kechoplay@yahoo.com', N'0123456789', CAST(0x6C3B0B00 AS Date), N'Messi')
INSERT [dbo].[OrderDetail] ([Ord_ID], [Pro_ID], [Number], [Price]) VALUES (1, 2, 3, 5490000)
INSERT [dbo].[OrderDetail] ([Ord_ID], [Pro_ID], [Number], [Price]) VALUES (1, 12, 1, 230000)
INSERT [dbo].[OrderDetail] ([Ord_ID], [Pro_ID], [Number], [Price]) VALUES (2, 6, 1, 590000)
INSERT [dbo].[OrderDetail] ([Ord_ID], [Pro_ID], [Number], [Price]) VALUES (2, 9, 3, 559000)
INSERT [dbo].[OrderDetail] ([Ord_ID], [Pro_ID], [Number], [Price]) VALUES (2, 10, 2, 119000)
INSERT [dbo].[OrderDetail] ([Ord_ID], [Pro_ID], [Number], [Price]) VALUES (3, 16, 3, 145000)
INSERT [dbo].[Position] ([Pos_ID], [Pos_Name]) VALUES (1, N'Admin')
INSERT [dbo].[Position] ([Pos_ID], [Pos_Name]) VALUES (2, N'Manager')
INSERT [dbo].[Position] ([Pos_ID], [Pos_Name]) VALUES (3, N'Staff')
INSERT [dbo].[Position] ([Pos_ID], [Pos_Name]) VALUES (4, N'Security')
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (1, N'Laptop Asus E402MA N2840', N'C:\Users\TungVoDoi\Desktop\anhsql\asus-e402ma-n2840-2gb-500gb-win10-400-400x400.png', 5990000, 1, 3)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (2, N'Laptop Acer ES1 311 N2840', N'C:\Users\TungVoDoi\Desktop\anhsql\acer-es1-311-n2840-2gb-500gb-win81-400-400x400.png', 5490000, 1, 4)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (3, N'Laptop Dell Inspiron 3551 Celeron N2840', N'C:\Users\TungVoDoi\Desktop\anhsql\dell-inspiron-3551-celeron-n2840-2gb-500gb-win81-2-400-400x400.png', 6690000, 1, 2)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (4, N'Laptop Asus X553MA N3540', N'C:\Users\TungVoDoi\Desktop\anhsql\asus-x553ma-sx684b-2-400x400.png', 7290000, 1, 4)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (5, N'Laptop Dell Inspiron 3458 i3 5005U', N'C:\Users\TungVoDoi\Desktop\anhsql\dell-inspiron-3458-i3-5005u-4gb-500gb-win10-400-400x400.png', 11290000, 1, 2)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (6, N'Newmen Gaming KB808', N'C:\Users\TungVoDoi\Desktop\anhsql\banphim1.jpg', 590000, 2, 11)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (7, N'Led Newmen GL800', N'C:\Users\TungVoDoi\Desktop\anhsql\ban-phim-led-newmen-gl800-den-0763-7223521-1-webp-gallery.jpg', 399000, 2, 11)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (8, N'Led Newmen GM100', N'C:\Users\TungVoDoi\Desktop\anhsql\ban-phim-led-newmen-gm100-xam-3426-2689901-2-webp-gallery.jpg', 549000, 2, 11)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (9, N'Assassin AK7000', N'C:\Users\TungVoDoi\Desktop\anhsql\-assassin-ak7000-trang-6803-5566451-2-webp-gallery.png', 559000, 2, 7)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (10, N'Dell USB Optical Mouse', N'C:\Users\TungVoDoi\Desktop\anhsql\dell-usb-optical-mouse-den-9714-3131951-1-webp-gallery.jpg', 119000, 3, 2)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (11, N'Dell Wireless Mouse WM112', N'C:\Users\TungVoDoi\Desktop\anhsql\dell-wireless-mouse-wm112.jpg', 120000, 3, 2)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (12, N'Motospeed F60', N'C:\Users\TungVoDoi\Desktop\anhsql\motospeed-F60-chuyen-game_2-120.jpg', 230000, 3, 8)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (13, N'USB 3.0 Kingston DataTraveler 100 G3 DT100G3 16gb', N'C:\Users\TungVoDoi\Desktop\anhsql\usb-3-0-kingston-datatraveler-100-g3-dt100g3-16gb.jpg', 144000, 5, 5)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (14, N'USB Transcend JetFlash 500 8gb', N'C:\Users\TungVoDoi\Desktop\anhsql\usb-transcend-jetflash-500-16gb-xanh-la.jpg', 179000, 5, 6)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (15, N'USB Sony USM8GR BC 8gb', N'C:\Users\TungVoDoi\Desktop\anhsql\usb-sony-usm8gr-bc-8gb-den-3858-808832-1-webp-gallery.jpg', 109000, 5, 1)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (16, N'USB Kingmax 8gb', N'C:\Users\TungVoDoi\Desktop\anhsql\usb-kingmax-usb-8g-6262-951943-1-webp-gallery.jpg', 145000, 5, 9)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (17, N'RAM Corsair VENGEANCE PRO DDR3 8GB', N'C:\Users\TungVoDoi\Desktop\anhsql\ram1380615821.jpg', 1420000, 4, 10)
INSERT [dbo].[Product] ([Pro_ID], [Pro_Name], [Pro_Photo], [Pro_Price], [Gro_ID], [Sup_ID]) VALUES (18, N'Ram laptop Corsair Value select 4GB', N'C:\Users\TungVoDoi\Desktop\anhsql\ram-laptop-corsair-value-select-4gb-bus.jpg', 1266000, 4, 10)
INSERT [dbo].[ProGroups] ([Gro_ID], [Gro_Name]) VALUES (1, N'Computer')
INSERT [dbo].[ProGroups] ([Gro_ID], [Gro_Name]) VALUES (2, N'Keyboard')
INSERT [dbo].[ProGroups] ([Gro_ID], [Gro_Name]) VALUES (3, N'Mouse')
INSERT [dbo].[ProGroups] ([Gro_ID], [Gro_Name]) VALUES (4, N'RAM')
INSERT [dbo].[ProGroups] ([Gro_ID], [Gro_Name]) VALUES (5, N'USB')
INSERT [dbo].[Staff] ([Staff_ID], [UserS], [Pass], [FullName], [Birthday], [Mobile], [Address], [Gender], [Pos_ID]) VALUES (1, N'Admin', N'123', N'Kieu Son Tung', CAST(0xAE1F0B00 AS Date), N'01645220249', N'Xuan Dinh', N'Male', 1)
INSERT [dbo].[Staff] ([Staff_ID], [UserS], [Pass], [FullName], [Birthday], [Mobile], [Address], [Gender], [Pos_ID]) VALUES (2, N'Manger', N'1234', N'Ronaldo', CAST(0xDB0F0B00 AS Date), N'01324567897', N'Posturga', N'Female', 2)
INSERT [dbo].[Staff] ([Staff_ID], [UserS], [Pass], [FullName], [Birthday], [Mobile], [Address], [Gender], [Pos_ID]) VALUES (3, N'Staff', N'12345', N'Messi', CAST(0xEB120B00 AS Date), N'1654064148', N'agentina', N'Female', 3)
INSERT [dbo].[Staff] ([Staff_ID], [UserS], [Pass], [FullName], [Birthday], [Mobile], [Address], [Gender], [Pos_ID]) VALUES (4, N'Torres', N'123456789', N'Fernando Tores', CAST(0x23140B00 AS Date), N'1654064148  ', N'spain  ', N'Male', 3)
INSERT [dbo].[Staff] ([Staff_ID], [UserS], [Pass], [FullName], [Birthday], [Mobile], [Address], [Gender], [Pos_ID]) VALUES (5, N'Tung', N'123456789', N'Kieu Son Tung', CAST(0xAE1F0B00 AS Date), N'01645220249', N'Xuan Dinh', N'Male', 3)
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (1, N'SONY', N'03216846518')
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (2, N'DELL', N'32168543618')
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (3, N'ASUS', N'1206510561')
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (4, N'ACER', N'3206564984')
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (5, N'KINGSTON', N'3168498418')
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (6, N'TRANCEND', N'321681384')
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (7, N'APPLE', N'03203206500')
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (8, N'PANASONIC', N'0132156498')
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (9, N'KINGMAX', N'5489754198')
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (10, N'CONSAIR', N'30313132168')
INSERT [dbo].[Supplier] ([Sup_ID], [Sup_Name], [Sup_Telephone]) VALUES (11, N'NEWMEN', N'0132456798')
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Order] FOREIGN KEY([Ord_ID])
REFERENCES [dbo].[Order] ([Ord_ID])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Order]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Product] FOREIGN KEY([Pro_ID])
REFERENCES [dbo].[Product] ([Pro_ID])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Product]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_ProGroups] FOREIGN KEY([Gro_ID])
REFERENCES [dbo].[ProGroups] ([Gro_ID])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_ProGroups]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [FK_Product_Supplier] FOREIGN KEY([Sup_ID])
REFERENCES [dbo].[Supplier] ([Sup_ID])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [FK_Product_Supplier]
GO
ALTER TABLE [dbo].[Staff]  WITH CHECK ADD  CONSTRAINT [FK_Staff_Position] FOREIGN KEY([Pos_ID])
REFERENCES [dbo].[Position] ([Pos_ID])
GO
ALTER TABLE [dbo].[Staff] CHECK CONSTRAINT [FK_Staff_Position]
GO
USE [master]
GO
ALTER DATABASE [ComputerStore] SET  READ_WRITE 
GO
