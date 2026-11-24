Lesson 6: Polymorphism and Abstraction Project in Java

 Unsa ang Gibuhat sa mga Programa?
Kini nga folder naglangkob sa duha ka Java programs nga nagpakita kon giunsa paggana ang duha ka importante nga Object-Oriented Programming (OOP) concepts:
1. PolymorphismDemo.java - Nagpakita kon giunsa paggamit ang usa ka parent reference aron pagtawag sa lain-laing behavior sa mga child classes pinaagi sa method overriding. Ang gipili nako nga scenario diri kay ang Payment System (CreditCard, PayPal, ug CashOnDelivery).
2. AbstractionDemo.java - Nagpakita kon giunsa pagtago sa abstract class ang detalye ug pagpugos sa mga child classes sa pagbuhat sa ilang kaugalingong implementation. Ang gipili nako nga scenario diri kay ang Smart Home Devices (SmartLight ug SmartAirConditioner).

---

 Giunsa Paggana ang Polymorphism sa Code?
Ang Polymorphism nagpasabot nga "daghang porma." Sa akong `PolymorphismDemo.java`:
 Parent Class: PaymentMethod (ang nagdala sa generic method nga `processPayment()`).
Child Classes: `CreditCard`, `PayPal`, ug `CashOnDelivery` (gigamit ang keyword nga `extends`).
Overridden Method: Ang method nga `processPayment(double amount)` gi-override sa tagsa-tagsa ka child classes gamit ang annotation aron mahatagan og lain-laing proseso o mensahe ang matag pamaagi sa pagbayad.

 Giunsa Paggana ang Abstraction sa Code?
Ang Abstraction nagpasabot og pagtago sa complicated details ug pagpakita lang sa kinahanglanon. Sa akong `AbstractionDemo.java`:
Abstract Class: `SmartDevice` (nag-define sa general structure ug naay regular method nga `displayInfo()`).
Abstract Method: `public abstract void turnOn();` (walay body o implementation sa parent class).
*Implementation: Ang mga child classes nga `SmartLight` ug `SmartAirConditioner` maoy mo-implement sa `turnOn()` method subay sa ilang tagsa-tagsa ka pamaagi sa pag-on.

 Kalainan sa Polymorphism ug Abstraction
 Ang Polymorphism nag-focus sa behavior kon giunsa pagtubag sa lain-laing objects ang usa ka parehas nga tawag (method call).
 Ang Abstraction nag-focus sa structure ug pag-establisar og template o blueprint kung unsa ang kinahanglan buhaton sa mga child classes samtang gitago ang internal details.


 Reflection Questions

 1. Why is method overriding important in polymorphism? What happens if a child class does not override the parent's method?
Importante kaayo ang method overriding kay mao kini naghatag og katakus sa child class sa pag-ilis o pag-customize sa behavior sa parent method sumala sa iyang panginahanglan. Kon ang child class dili mo-override sa method, ang modagan kay ang default implementation gikan sa parent class, ug mawala ang epekto sa polymorphism kay parehas na lang silag agianan o resulta.

2. Why can't we create an object directly from an abstract class? What is the purpose of this restriction? Unsa ang 
Dili nato pwede ma-instantiate ang abstract class kay incomplete pa kini—naa kini abstract methods nga walay body o code kon unsaon paglihok. Ang katuyoan niini nga restriction mao ang pagseguro nga ang abstract class magsilbi lang gyud nga blueprint o giya, ug ang mga child classes lang ang pwede mohimo og actual objects kay sila ra man ang kompleto ang implementation.

 3. If you need to add another child class to your polymorphism program, how would your existing code handle it?
Sayon ra kaayo! Tungod sa polymorphism, dili na nimo kinahanglan usbon ang existing parent class o ang ubang child classes. Maghimo lang ka og bag-ong child class nga mo-extend sa parent class ug mo-override sa method. Ang imong `main` program o uban pang methods makadawat dayon sa bag-ong class nga walay guba sa daang code.

 4. Can polymorphism and abstraction work together in a single program? Explain how and provide an example.
Oo, pwede kaayo sila mag-uban, ug sa tinuod lang, kasagaran silang gigamit nga magkauban sa OOP. Ang abstraction maghatag og abstract parent class ug abstract method, dayon ang mga child classes mo-override niana nga method (nga mao na ang polymorphism). Pananglitan: Ang abstract class nga `PaymentMethod` adunay abstract method nga `processPayment()`, unya ang mga child classes sama sa `CreditCard` mo-override niini. Kung magbutang ka og parent reference nga mo-point sa `CreditCard`, nagamit nimo ang abstraction ug polymorphism sa usa ra ka programa.

 5. As a future programmer, when would you use polymorphism, and when would you use abstraction?
 Gamiton nako ang Polymorphism kon duna koy mga related objects nga nagkinahanglan og parehas nga mga ngalan sa operation pero lain-laing pamaagi sa pagbuhat (pananglitan: pag-print, pagdrowing, o pagbayad) aron limpyo ug flexible ang akong code.
Gamiton nako ang Abstraction kon gusto nako maghimo og standard template o structural rule para sa grupo sa mga classes nga sundon sa uban (pananglitan: database connectors o device drivers) aron masiguro nga naay parehas nga pormat ang tanan samtang gitago ang komplikadong detalye.