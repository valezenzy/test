#include <iostream>
#include <string>
#include <algorithm>
#include <regex>

int main(){

	std::string frase;

	std::cout << "Inserisci una frase";
	std::cin >>frase;

//frase.erase(std::remove(frase.begin(),frase.end(),' '), frase.end());

std:: string stringa2 = frase;

		 std::reverse(frase.begin(),frase.end());
		 std::cout <<frase;
		 std::cout <<stringa2;
		if (stringa2 == frase){
			std::cout << "la frase è palindroma";
		}
		else{
			std::cout << "la frase non è palindroma";
		}



	return EXIT_SUCCESS;
}
