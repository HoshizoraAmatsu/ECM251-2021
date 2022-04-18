import 'package:flutter/material.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.blue,
      ),
      home: const MinhaListaEstatica(),
    );
  }
}

class MinhaListaEstatica extends StatelessWidget {
  const MinhaListaEstatica({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: Text("Meu App de lista estatica"),
        ),
        body: ListView(
          children: [
            ListTile(
              title: Text("Megumin"),
              leading: CircleAvatar(
                radius: 24.0,
                child: Image.network(
                  "https://i.imgur.com/Kx856NJ.jpeg",
                  fit: BoxFit.contain,
                ),
              ),
            ),
            ListTile(
              title: Text("Megumin"),
              leading: CircleAvatar(
                radius: 24.0,
                child: Image.network(
                  "https://i.imgur.com/Kx856NJ.jpeg",
                  fit: BoxFit.contain,
                ),
              ),
            )
          ],
        ));
  }
}
