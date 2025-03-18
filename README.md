# IP2025_W4

Structura cod:

Person este clasa parinte din care provin BankCustomer si BankEmployee. Scopul acesteia este sa ofere informatiile generale pentru angajat si client ca atunci cand cream obiecte pentru acestea sa nu avem atribute ce le tot repetam. 

BankCustomer este o clasa pentru client, acesta poate pune intrebari pentru componenta AI prin metoda "askQuestion" acesta putand sa trimita intrebari, ce mai apoi vor fi verificate daca sunt cunocute.
Daca intrebarea este cunocuta, AI genereaza un raspuns automat, si il ofera clientului. Altfel daca intrebarea nu este cunocuta intrebarea si raspunsul AI sunt trimise la angajat.
Metoda "receivedAnswer" este folosita de angajat.

BankEmployee are metoda "reviewResponse", in cadrul acesteia se fac niste verificari generale ale raspunsului dat de AI si daca este inadecvat, va contacta un angajat ce sa ofera o solutie potrivita.
Metoda privata "isResponseRelevant" are ca scop sa verifice daca pentru fiecare intrebare, raspunsul contine niste cuvinte cheie. Asa verificam daca raspunsul este adecvat.

Componnta AI (Generata cu AI) are ca scop oferirea de raspuns pentru client prin "generateResponse" ce mai apoi este trimit la client si la angajat pentru verificari.

Echipa:

Diagrame:
Sorin Greu 2E2
Bogdan Viziru 2E2

Cod cu AI:
Denis Brezuleanu 2E2
Mario Gusa 2E2

Cod fara AI:
Nicu Acasandrei 2E1
Claudia Iftimoaia 2E1
