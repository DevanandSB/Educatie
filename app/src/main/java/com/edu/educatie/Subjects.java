package com.edu.educatie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.shashank.sony.fancytoastlib.FancyToast;

import java.util.Objects;

public class Subjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        TextView Book, Author1;
        CardView III1, III2, III3, III4, III5;
        CardView II1, II2, II3, II4, II5;
        CardView I1, I2, I3, I4, I5;

        Book = findViewById(R.id.BookName);
        Author1 = findViewById(R.id.AuthorName);

        III1 = findViewById(R.id.III1);
        III2 = findViewById(R.id.III2);
        III3 = findViewById(R.id.III3);
        III4 = findViewById(R.id.III4);
        III5 = findViewById(R.id.III5);


        II1 = findViewById(R.id.II1);
        II2 = findViewById(R.id.II2);
        II3 = findViewById(R.id.II3);
        II4 = findViewById(R.id.II4);
        II5 = findViewById(R.id.II5);

        I1 = findViewById(R.id.I1);
        I2 = findViewById(R.id.I2);
        I3 = findViewById(R.id.I3);
        I4 = findViewById(R.id.I4);
        I5 = findViewById(R.id.I5);

        II1.setOnClickListener(view -> FancyToast.makeText(Subjects.this, "Feature is not Available for this Subject", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show());

        II2.setOnClickListener(view -> FancyToast.makeText(Subjects.this, "Feature is not Available for this Subject", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show());

        II3.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            II3.startAnimation(animation);
            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            String SubName = "Allied Physics for Computer Science - I";
            String Unit1 = "Unit 1: Active Devices";
            String Unit2 = "Unit 2: Passive Devices";
            String Unit3 = "Unit 3: Series and Parallel Circuits";
            String Unit4 = "Unit 4: LASER";
            String Unit5 = "Unit 5: Fiber Optics and Opto-Electronic Devices";

            String Content1 = "Semiconductor - Types of Semiconductor - PN junction diode - V-I Characteristics of junction diode - Zener diode" +
                    "Zener diode - V-I characteristics of Zener diode - Bipolar Junction Transister(BJT): Types of PNP and NPN Transistor - Working of " +
                    "NPN Tranistor - CB, CE, CC modes - Characteristics of CE mode - JFET - Construction and working of n-channel FET -  Characteristics" +
                    "- Parameters of JFET - Advantages of JFET over BJT.";

            String Content2 = "Resistor: \n" +
                    "        Color coding Scheme- Types of resistors - Factors affecting resistance of a material - Specific Resistance.\n\n " +
                    "Capacitor: \n" +
                    "        Principle - Capacitance - Factors affecting capacitance of the capacitor- Types of Capacitor - Capacitor Coding - Series and Parallel Connection of Capacitors \n\n" +
                    "Integrated Circuits: \n " +
                    "        Advantages and Disadvantages - IC Classification - Fabrication of Components resistor and Capacitor on Monolithic IC's";

            String Content3 = "Series Circuit: \n" +
                    "        Total resistance in a Circuit - Polarity of Voltage drop - Resistors in series and Voltage Division technique - Short Circuits - Effects of Short Circuits - " +
                    "Detecting short circuits - Opening Circuits in series connection - Detecting Open Circuits.\n\n" +
                    "Parallel Circuits: \n" +
                    "        Total resistance in a parallel circuit - Polarity of Voltage drop - Resistiors in series and voltage division technique - " +
                    "Shorts in parallel Circuits - Opens in Parallel Circuits - Applications of parallel Circuits - Fuse and Circuit breaker.\n\n" +
                    "Series and Parallel Circuits: \n " +
                    "        Kirchoff's law - Current  and Voltage law.";

            String Content4 = "LASER - Characteristics - Stimulated absorption - Spontaneous emmsion - Stimulated emmsion - Population inversion - Einstein Coefficients for three level" +
                    "system - Types of pumping - Principles of laser - Conditions to achive laser action - Carbondioxide laser, Helium - Neon laser, Nd:YAG laser - Semiconductor laser" +
                    " - Applications of Lasers in industry, computer and communication fields.";

            String Content5 = "Construction - Working principle - Light propagation in optical fibers - Acceptance angle and Numerical aperture - Classification of fibers based on Fiber Optic " +
                    " based on materials, refractive index profile and modes - Loses in optical fibers - Application communication over conventional Communication Systems. \n" +
                    "Light emitting diodes (LEDs) - Applications - Seven segment display - Liquid crystal display construction -  working - photo resistor - Photo diode - Photo transistor - " +
                    "Solar cells - V-I Charcteristics.";


            intent.putExtra("SubName", SubName);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            startActivity(intent);
        });

        II4.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            II4.startAnimation(animation);
            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            String SubName = "Object Oriented Programming with C++";
            String AuthorName = "Author: E Balagurusamy";
            String BookName = "Book Name: Object Oriented Programming with C++, 5th Edition, McGraw Hill Education India Pvt Ltd. 2012";

            String Unit1 = "Unit 1: Basic Concepts";
            String Unit2 = "Unit 2: Functions";
            String Unit3 = "Unit 3: Classes and Objects";
            String Unit4 = "Unit 4: Inheritance and Polymorphism";
            String Unit5 = "Unit 5: Exception Handling and Files";

            String Content1 = "Chapter 1.3 - 1.7 \nChapter 2.3, 2.6 \nChapter 3.2 - 3.6, 3.15, 3.18, 3.20, 3.25";
            String Content2 = "Chapter 4.1 - 4.11 \nChapter 9.1 - 9.5";
            String Content3 = "Chapter 5.4, 5.8, 5.11 - 5.15 \nChapter 6.1 - 6.11";
            String Content4 = "Chapter 7.1 - 7.9\nChapter 8.3, 8.5 - 8.7, 8.9 & 8.10\nChapter 9.6";
            String Content5 = "Chapter 11.1 - 11.7 \nChapter 13.1 - 13.9";

            intent.putExtra("SubName", SubName);
            intent.putExtra("AuthorName", AuthorName);
            intent.putExtra("BookName", BookName);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            startActivity(intent);
        });

        II5.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            II5.startAnimation(animation);
            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            String SubName = "Data Structure and Algorithms";
            String AuthorName = "Author: Ashok N.Kamthne";
            String BookName = "Book Name: Introduction to Data Structure in C, Pearson Education:2005 (Singapore)";

            String Unit1 = "Unit 1: Arrays and Linked List";
            String Unit2 = "Unit 2: Stack and Queue";
            String Unit3 = "Unit 3: Trees";
            String Unit4 = "Unit 4: Searching and Sorting";
            String Unit5 = "Unit 5: Graph";

            String Content1 = "Chapter 2.1 - 2.5, 2.10, 2.11 - 2.16 \nChapter 6.1, 6.4, 6.6, 6.14 - 6.24, 6.26, 6.27";
            String Content2 = "Chapter 4.1 - 4.10 \nChapter 5.1 - 5.9";
            String Content3 = "Chapter 8.1 - 8.3, 8.7 - 8.12";
            String Content4 = "Chapter 11.1 - 11.4\nChapter 10.1 - 10.6";
            String Content5 = "Chapter 9.1 - 9.6";

            intent.putExtra("SubName", SubName);
            intent.putExtra("AuthorName", AuthorName);
            intent.putExtra("BookName", BookName);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            startActivity(intent);
        });


        III1.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            III1.startAnimation(animation);
            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            String SubName = "Programming With Java";
            String AuthorName = "Author: S. Sagayaraj, R. Denis, P. Karthik & D. GajaLakshmi";
            String BookName = "Book Name: Java Programming, Universities Press, 2017";

            String Unit1 = "Unit 1: Basics, Essentials, Control Statements And Classes & Object";
            String Unit2 = "Unit 2: Arrays, Inheritance, Interfaces and Packages";
            String Unit3 = "Unit 3: String & Exception Handling And Multithreading";
            String Unit4 = "Unit 4: I/O & File Handling, Applet and GUI - I";
            String Unit5 = "Unit 5: GUI - II And Java Database Connectivity";

            String Content1 = "Chapter 1.1 - 1.8 \nChapter 2.1 - 2.12 \nChapter 3.1 - 3.16 \nChapter 4.1 - 4.15";
            String Content2 = "Chapter 5.1 - 5.11 \nChapter 7.1 - 7.7 \nChapter 8.1 - 8.8";
            String Content3 = "Chapter 6.1 - 6.10 \nChapter 9.1 - 9.10 \nChapter 10.1 - 10.11";
            String Content4 = "Chapter 11.1 - 11.16 \nChapter 12.1 - 12.6 \nChapter 13.1 - 13.6";
            String Content5 = "Chapter 14.1 - 14.4 \nChapter 16.1 - 16.6";


            intent.putExtra("SubName", SubName);
            intent.putExtra("AuthorName", AuthorName);
            intent.putExtra("BookName", BookName);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            startActivity(intent);
        });

        III2.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            III2.startAnimation(animation);
            String SubName = "Operating System";
            String AuthorName = "Author: William Stallings";
            String BookName = "Book Name: Operating System: Internals and Design Principles, 7th Edition, Pearson Education Inc., Fourth Impression 2016";

            String Unit1 = "Unit 1: Operating System Overview & Process Description";
            String Unit2 = "Unit 2: Uniprocessor, MultiProcessor and Real-Time Scheduling";
            String Unit3 = "Unit 3: Mutual Exclusion, Synchronization & Deadlock";
            String Unit4 = "Unit 4: Memory Management and Virtual Memory";
            String Unit5 = "Unit 5: I/O Management, Disk Scheduling and File Management";

            String Content1 = "Operating System Objectives and Functions - The Evolution of Operating Systems - Developments leading to Modern Operating System" +
                    "- Process Description and Control: Control of Process - Process States - Process Description - Process Control and Security Issues";
            String Content2 = "Type of Processor Scheduling - Scheduling Algorithms - Multiprocessor Scheduling - Real-Time Scheduling.";
            String Content3 = "Mutual Exclusion: Hardware Support - Semaphores: Message Passing - Readers / Writers Problem - Principles of Deadlock -\" +\n" +
                    "Deadlock Prevention - Deadlock Avoidance - Deadlock Detection";
            String Content4 = "Memory Management Requirements - Memory Partioning - Paging - Segmentation - Security Issues - \" +\n" +
                    "Virtual Memory: Hardware and Conrol Structures - Operating System Software";
            String Content5 = "I/O Devices - Organisation of the I/O Function  - I/O Buffering - Disk Scheduling - File Management:\" +\n" +
                    "Overview - File Organisation and Access - File Directories - File Sharing - Recording Blocking - Secondary Storage Management\" +\n" +
                    " - File System Security.";


            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            intent.putExtra("SubName", SubName);
            intent.putExtra("AuthorName", AuthorName);
            intent.putExtra("BookName", BookName);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            startActivity(intent);
        });

        III3.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            III3.startAnimation(animation);
            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            String SubName = "Software Engineering";
            String AuthorName = "Author: Pressman, Roger S.";
            String BookName = "Book Name: Software Engineering a Practitioner's Approach , 7th Edition , New York: McGraw Hill International Edition, 2010.";

            String Unit1 = "Unit 1: Software Process";
            String Unit2 = "Unit 2: Modeling I";
            String Unit3 = "Unit 3: Modelling II";
            String Unit4 = "Unit 4: Quality Management";
            String Unit5 = "Unit 5: Managing Software Projects";

            String Content1 = "Chapter 1.1 - 1.6 \nChapter 2.1 - 2.6 \nChapter 3.1 - 3.4";
            String Content2 = "Chapter 5, 6, 7 \nChapter 8.2 - 8.4";
            String Content3 = "Chapter 9 \nChapter 10.1 - 10.3 \nChapter 10.5 - 10.7 \nChapter 11.1 - 11.4";
            String Content4 = "Chapter 14\nChapter 16.1 - 16.3 & 16.6\nChapter 17.1 - 17.3 & 17.6 - 17.8 \nChapter 18.1 - 18.7";
            String Content5 = "Chapter 24, 27, 28";


            intent.putExtra("SubName", SubName);
            intent.putExtra("AuthorName", AuthorName);
            intent.putExtra("BookName", BookName);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            startActivity(intent);
        });

        III4.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            III4.startAnimation(animation);
            String SubName = "Linux and Shell Programming";
            String AuthorName = "Yashavant Kanetkar.";
            String BookName = "Unix and Shell Programming, New Dehli BPB Publisher, 1996";

            String Unit1 = "Unit 1: Organization";
            String Unit2 = "Unit 2: Linux Commands";
            String Unit3 = "Unit 3: SHELL Programming - I";
            String Unit4 = "Unit 4: SHELL Programming - II";
            String Unit5 = "Unit 5: System Calls";

            String Content1 = "Chapter 1, 2, 3";
            String Content2 = "Chapter 4,5,6,7,8";
            String Content3 = "Chapter 9, 10";
            String Content4 = "Chapter 11";
            String Content5 = "Chapter 7.1, 7.2.1 to 7.2.6, 7.3 to 7.5, 7.8";

            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            intent.putExtra("SubName", SubName);
            intent.putExtra("AuthorName", AuthorName);
            intent.putExtra("BookName", BookName);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            startActivity(intent);
        });

        III5.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            III5.startAnimation(animation);
            String SubName = "Programming With PHP";
            String AuthorName = "Julie C.Meloni, Sams.";
            String BookName = "Teach yourself PHP, MySQL, and Apache, 4th Edition, 2008 by Sams Publishing.";

            String Unit1 = "Unit 1: Fundamentals of PHP";
            String Unit2 = "Unit 2: PHP Form";
            String Unit3 = "Unit 3: PHP Advanced";
            String Unit4 = "Unit 4: PHP with MySQL Database";
            String Unit5 = "Unit 5: PHP - XML";

            String Content1 = "Chapter 3 to 8 , 10";
            String Content2 = "Chapter 11";
            String Content3 = "Chapter 12, 13";
            String Content4 = "Chapter 16";
            String Content5 = "Chapter 28";


            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            intent.putExtra("SubName", SubName);
            intent.putExtra("AuthorName", AuthorName);
            intent.putExtra("BookName", BookName);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            startActivity(intent);
        });

        I1.setOnClickListener(view -> FancyToast.makeText(Subjects.this, "Feature is not Available for this Subject", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show());

        I2.setOnClickListener(view -> FancyToast.makeText(Subjects.this, "Feature is not Available for this Subject", FancyToast.LENGTH_SHORT, FancyToast.INFO, false).show());

        I3.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            I3.startAnimation(animation);
            String SubName = "Allied Mathematics I";
            String AuthorName = "Author: Kenneth H. Rosen";
            String BookName = "Book Name: Discrete Mathematics and it's Applications, Tata Mc Graw Hill Pub. Co. Ltd., New York, Tenth reprint 2006.";

            String Unit1 = "Unit 1: Logic and Proofs";
            String Unit2 = "Unit 2: Mathematical Reasoning, Induction and Recursion";
            String Unit3 = "Unit 3: Combinatorics";
            String Unit4 = "Unit 4: Graphs";
            String Unit5 = "Unit 5: Modelling Computation";

            String Content1 = "Logic - Propositional Equivalences - Predicates and Quantifiers - Nested Quantifiers - Methods of Proof. \n" +
                    "\nChapter I: Sections 1.1 to 1.5";
            String Content2 = "Proof Strategy - Sequences and Summations - Mathematical Induction - Recursive Definitions and Structural Induction. \n" +
                    "\nChapter III: 3.1 to 3.4";
            String Content3 = "The Basics of Counting - The Pigeonhole Principle - Permutations and Combinations - Binomial Coefficients - Generalised " +
                    "Permutations and Combinations - Generating Permutations and Combinations. \n" +
                    "\nChapter IV: Section 4.1 to 4.6";
            String Content4 = "Introduction to Graphs - Graph Terminology - Representing Graphs and Graph Isomorphism - Connectivity - Euler and Hamilnton Paths" +
                    "Shortest Path Problems - Trees \n" +
                    "\nChapter VIII: Sections 8.1 to 8.6 \n" +
                    "Chapter IX: Sections 9.1, 9.3, 9.4";
            String Content5 = "Languages and Grammars - Finite State Machines with Output - Finite State Machines with no output - Languages Recognition. \n" +
                    "\nChapter XI: Sections: 11.1 to 11.4";


            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            intent.putExtra("SubName", SubName);
            intent.putExtra("AuthorName", AuthorName);
            intent.putExtra("BookName", BookName);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            startActivity(intent);
        });

        I4.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            I4.startAnimation(animation);
            String SubName = "Digital Computer Fundamentals";
            String AuthorName = "Author: Morris M Mano - For both books";
            String BookName = "Book 1: Computer System Architecture, Prentice Hall of India Pvt.Lmt., New Delhi, 1991 \n" +
                    "Book 2: Digital Logic and Computer Design, Prentice Hall of India Pvt.Lmt., New Delhi, 2001";

            String Unit1 = "Unit 1: Number System and Binary Arithmetic's";
            String Unit2 = "Unit 2: Logic Gates and Boolean Algebra";
            String Unit3 = "Unit 3: Map Simplification";
            String Unit4 = "Unit 4: Combinational Circuits";
            String Unit5 = "Unit 5: Flip Flops and Sequential Circuits";

            String Content1 = "Digital Computer and Digital System - Number System: Number Systems - Binary, Octal, Decimal and Hexadecimal" +
                    " - Conversion from one to another. Characters and Codes: BCD, ASCII, 2421 Code, Excess 3 code, Gray Code. Binary Arithmetic's: " +
                    "Binary Addition, Subtraction, Multiplication, Division. Complements: n's and n-1's Complements.";
            String Content2 = "Logic Gates: AND, OR, NOT, NOR, NAND, XOR, XNOR Gates - Logic Circuits and Boolean Algebra and Boolean Laws and Theorems " +
                    "De Morgan's Theorems - Duality Theorem.";
            String Content3 = "Simplification of Sum of Product and Product of Sum of Expressions - Karnaugh Map and Simplifications: " +
                    "Three Variable Maps, Four Variable Maps - Don't Care Condition.";
            String Content4 = "Combinational Circuits: Half and Full Adders - Half Subtractor and Full Subtractor - Encoders and Decoders - Multiplexers " +
                    "- Demultiplexers.";
            String Content5 = "Sequential Logic Design: Flip Flops - SR, JK, D and T Flip-Flops - Edge Triggered Flip-Flop - Master-Slave Flip-Flop - Shift " +
                    "Registers - Counters";


            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            intent.putExtra("SubName", SubName);
            intent.putExtra("AuthorName", AuthorName);
            intent.putExtra("BookName", BookName);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            startActivity(intent);
        });

        I5.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            I5.startAnimation(animation);
            String SubName = "Web Design Concepts";
            String AuthorName = "Author: Jon Ducktt.";
            String BookName = "Book Name: Web Programming with HTML, CSS and JAVASCRIPT, Wiley Publishing, 2005.";

            String Unit1 = "Unit 1: HTML Basics, Formatting Tags and Lists";
            String Unit2 = "Unit 2: Links, Images and Tables";
            String Unit3 = "Unit 3: Frames and Forms";
            String Unit4 = "Unit 4: Cascading Style Sheet - I";
            String Unit5 = "Unit 5: Cascading Style Sheet - II";

            String Content1 = "Chapter 1";
            String Content2 = "Chapter 2, 3 & 4";
            String Content3 = "Chapter 5, 6";
            String Content4 = "Chapter 7";
            String Content5 = "Chapter 8";


            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            intent.putExtra("SubName", SubName);
            intent.putExtra("AuthorName", AuthorName);
            intent.putExtra("BookName", BookName);

            intent.putExtra("Unit1", Unit1);
            intent.putExtra("Unit2", Unit2);
            intent.putExtra("Unit3", Unit3);
            intent.putExtra("Unit4", Unit4);
            intent.putExtra("Unit5", Unit5);

            intent.putExtra("Content1", Content1);
            intent.putExtra("Content2", Content2);
            intent.putExtra("Content3", Content3);
            intent.putExtra("Content4", Content4);
            intent.putExtra("Content5", Content5);

            startActivity(intent);
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Subjects.this, Home.class);
        startActivity(intent);
        finish();

    }

}