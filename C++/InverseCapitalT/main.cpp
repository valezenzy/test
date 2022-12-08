#include <iostream>
#include <string>


int main() {

	std::string stringa;
	std::getline(std::cin, stringa);

	for (size_t i { }; i < stringa.length(); i++) {

		if (islower(stringa.at(i))) {

			stringa.at(i)=toupper(stringa.at(i));

		}else{

			stringa.at(i)=tolower(stringa.at(i));
		}

	}

	std::cout<<stringa;

	return 0;

}

