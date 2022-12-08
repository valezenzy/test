#include <iostream>
#include <algorithm>
#include <string>



int main(){

	std::string frase;

	std::cout << "Inserisci la frase: ";
	std::getline(std::cin,frase);
	frase[0]= toupper(frase[0]);

	 for( int i = 0; i < frase.length();i++) {
		 if (std::isspace(frase[i]))
		  {
		   frase[i+1] = toupper(frase[i+1]);

		  }
	 }


	 std::cout <<frase;


    return EXIT_SUCCESS;
}
