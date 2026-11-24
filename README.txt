 Sorting Algorithms Project in Java

 Unsa ang Gibuhat sa Akong Java Program?
Kini nga Java program (`SortingAlgorithms.java`) kay nag-sort o naghan-ay sa mga numero gikan sa pinakagamay padulong sa pinakadako. Naa koy gi-declare nga original array nga naay 11 ka unsorted numbers. Para patas ang pag-test, naghimo ko og tulo ka separate copies sa maong array ug gi-apply nako ang tulo ka sorting algorithms: Bubble Sort, Selection Sort, ug Insertion Sort. Pagkahuman, i-display sa program ang original array ug ang sorted results sa matag algorithm.


 Giunsa Pagtrabaho ang Matag Algorithm?

Bubble Sort: Mag-compare ni siya og duha ka tapad nga numero. Kon mas dako ang naa sa wala kaysa sa tuo, i-swap niya ang duha. Balik balikon ni niya hangtod nga ang pinakadakô nga numero mo-lutaw padulong sa pinakatumoy sa array.
Selection Sort: Bahinon niya ang array sa duha: ang sorted na ug ang unsorted pa. Sa matag tuyok, pangitaon niya ang pinakagamay nga numero sa unsorted nga bahin, dayon ibaylo  niya kini sa pinakaunang pwesto sa wala pa mahapsay.
Insertion Sort: Murag naghan-ay og baraha sa kamot. Mokuha ni siya og usa ka numero, tan-awon niya ang mga nahapsay na nga numero sa wala, ug isuksok niya kini sa saktong pwesto pinaagi sa pag-iswag sa mas dagko nga numero.



 Mga Kalainan sa Tulo ka Sorting Algorithms
Sa pagbalhin og numero: Ang Bubble Sort sige og swap sa mga tapad nga numero. Ang Selection Sort kas-a ra mo-swap kada tuyok human makit-an ang pinakagamay. Ang Insertion Sort mag-iswag lang og mga numero imbis mag-swap.
Sa ilang focus: Ang Bubble Sort mag focus sa mga tupad nga numero; ang Selection Sort mangita sa pinakagamay sa tibuok listahan; ang Insertion Sort mag-focus sa pagsuksok sa numero sa saktong lugar.



 Reflection Questions

 1. How does each sorting algorithm arrange numbers? What makes their processes different?
Silang tulo naghan-ay sa mga numero sa ascending order, pero lahi ilang diskarte. Ang Bubble Sort hinay-hinay nga nagduso sa mga dagkong numero padulong sa likod pinaagi sa pag-swap sa magtapad. Ang Selection Sort mangita una sa pinakagamay sa tanan ayha ibutang sa atubangan. Ang Insertion Sort magtukod og hapsay nga linya gikan sa wala padulong sa tuo pinaagi sa pagsuksok sa bag-ong numero sa saktong pwesto.

 2. Among the three sorting algorithms, which one do you think is the easiest to understand and implement? Why?
Para nako, ang **Bubble Sort** ang pinakasayon sabton ug i-code. Simple ra kaayo iyang logic: tan-awon lang nimo ang duha ka tapad nga numero, ug kon baliktad sila, i-swap dayon. Wala nay daghang variables nga bantayan sama sa `minIndex` sa Selection Sort o pag-iswag sa mga numero sa Insertion Sort.

 3. If the numbers are already sorted, which algorithm do you think would perform better? Explain your answer based on how the algorithms work.
Ang Insertion Sort ang pinakamaayo kon hapsay na daan ang mga numero. Tungod kay i-check ra niya kon mas gamay ba ang numero sa wala; kon sakto na, dili na siya mosulod sa iyang while loop ug mopadayon na dayon sa sunod. Sa Bubble Sort ug Selection Sort, moagi gihapon sila sa tanan nilang loops bisan og hapsay na ang listahan, maong mas daghan gihapon sila og trabaho.

 4. What will happen if you add more numbers to your array? How might this affect the performance of each sorting algorithm?
Kon dugangan pa og daghang numero ang array, mohinay ug modugay ang pag-run sa program. Tungod kay kining tulo naay $O(n^2)$ nga time complexity, kon mo-doble ang gidaghanon sa numero, mo-upat ka pilo ang gidaghanon sa pag-compare nga buhaton sa kompyuter. Dili pa ni halata sa 10 ka numero, pero kon liboan na, mohinay na gyud silang tulo.

 5. As a future programmer, why is it important to understand different sorting algorithms instead of using just one?
Importante ni kay walay usa ka algorithm nga maayo sa tanang sitwasyon. Kon gamay ra ang data o hapit na hapsay, maayo ang Insertion Sort. Kon mahal o bug-at ang pag-swap sa memory, mas maayo ang Selection Sort. Kon kabalo ta sa ilang kalainan, makapili ta sa pinakapaspas ug pinaka-episyente nga pamaagi para sa atong mga future projects.