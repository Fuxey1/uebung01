package ueb01;

class Palindrom {
	static boolean istPalindrom(String s) {
		// Verwenden Sie die Klasse CharStackImpl um auf Palindrom zu testen!

		CharStack cs = new CharStackImpl();

		s = s.replaceAll(" ","");
		s = s.toUpperCase();

		char [] chararr = s.toCharArray();





		return false;
	}
}
