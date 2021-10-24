package com.example.songr;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SongrApplicationTests {


//	@Test
//	void AlbumsConstructorTest(){
//		Albums albums = new Albums("other side","malik", 5,250 ,"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg");
//		String expected = "Albums{title='other side', artist='malik', songCount=5, length=250.0, imageUrl='https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg'}";
//		assertEquals(expected,albums.toString());
//	}
	@Test
	void  testConstuctorGetterSitter1(){
		Albums album = new Albums("other side","malik", 5,250 ,"https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg");
		album.setTitle("other side");
		album.setArtist("malik");
		album.setImageUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg");
		String str = "other side";
		String str2 = "malik";
		String str3 = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b0/Nancy_Ajram_signing_ceremony.jpg/220px-Nancy_Ajram_signing_ceremony.jpg";
		assertEquals(str,album.getTitle());
		assertEquals(str2,album.getArtist());
		assertEquals(str3,album.getImageUrl());
	}

	@Test
	void testConstuctorGetterSitter2(){
		Albums album = new Albums("other side","malik", 3,300 ,"https://upload.wikimedia.org/wikipedia/zh/thumb/4/45/Billie_Eilish_-_Happier_Than_Ever.png/220px-Billie_Eilish_-_Happier_Than_Ever.png");
		album.setTitle("other side");
		album.setArtist("malik");
		album.setImageUrl("https://www.icon-icon.com/wp-content/uploads/2021/07/dua-lipa.jpeg");
		int expected = 300;
		assertEquals(expected,album.getLength());
	}

}
