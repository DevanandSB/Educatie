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
//        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

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

        II2.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            II2.startAnimation(animation);
            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            String SubName = "English for Business Communication";
            String Unit1 = "Unit 1";
            String Unit2 = "Unit 2";
            String Unit3 = "Unit 3";
            String Unit4 = "Unit 4";
            String Unit5 = "Unit 5";

            String Content1 = "Speaking:\nFacing an interview, Tele-interviews\n\nWriting:\nApplying for Jobs, Preparing Resumes, Standard Business Letters\nProse: The Four Brothers' by Walter De La Mare Poem: The Daffodils' by William Wordsworth\nPhrasal Verbs: Starting with P, Q and R";

            String Content2 = "Speaking:\nTelephone manners. Asking for information and giving information. Making Appointment, canceling and rescheduling Appointments\n\nWriting:\nWriting minutes of a meeting, writing short reports\nShort Story: A Telephonic Conversation by Samuel\nPoem: Telephone Conversation by Wole Soyinka\nVerbs: Starting with S, T and U.";

            String Content3 = "Speaking:\nHandling customers/clients, receiving visitors\n\nWriting:\nThanking letters, congratulatory letters, letters, condolence letters Prose: Two Gentlemen of Verona by A.J. Cronin\nPoem: Night of the Scorpion by Nissim Ezekiel Phrasal Verbs: Starting with V, W, X, Y and Z";

            String Content4 = "Speaking:\nMaking presentations\n\nWriting:\nA Project - Preparing a Project Presentation Effective Communication in Business Contexts - some principles and samples and preparing presentations\nProse: X = X + 1 Syndrome by R. K. Narayan\nPoem: All the world's a stage by William Shakespeare\nIdioms: Spirituality related";

            String Content5 = "Speaking:\nNegotiating Group Discussion\n\nWriting:\nA Case study - involving group discussion and submitting a written report\nPlay: The Trial of Billy Scott' by Mazie Hall\nIdioms: Love related";


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

        II3.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            II3.startAnimation(animation);
            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            String SubName = "Allied Physics for Computer Science - I";
            String Unit1 = "Unit 1: Semiconductor Devices and Applications";
            String Unit2 = "Unit 2: Operational Amplifier and Applications";
            String Unit3 = "Unit 3: Switching and Wave Shaping Circuits";
            String Unit4 = "Unit 4: Communication System";
            String Unit5 = "Unit 5: Digital Electronics";

            String Content1 = "Diode as a rectifier: Half wave, full wave and bridge rectifiers - efficiency - ripple factor - filter circuits: capacitor filters - a filters - Zener diode as a voltage regulator - Clipping Circuit and Clamping circuits using diodes - single stage CE transistor amplifier - band width and cut off frequencies.";

            String Content2 = "Operational amplifiers - characteristics of ideal operational amplifier - CMRR - voltage gain of op amp in inverting and non-inverting modes - applications of OPAMP: Voltage Follower - Sign and Scale changer - adder - subtractor and average - Integrator and differentiator - Instrumentation amplifier";

            String Content3 = "Operational amplifiers - characteristics of ideal operational amplifier - CMRR - voltage gain of op amp in inverting and non-inverting modes - applications of OPAMP: Voltage Follower - Sign and Scale changer - adder - subtractor and average - Integrator and differentiator - Instrumentation amplifier.";

            String Content4 = "Modulation - need for modulation - types of modulation - amplitude modulation - modulation factor - equation of an amplitude modulated wave -- frequency spectrum - bandwidth - total power of AM wave - fraction of total power carried by side bands advantages of AM - limitations of AM - frequency modulation - advantages of FM over AM - demodulation - AM diode detector AM transmitter - FM transmitter - Super heterodyne AM receiver Super heterodyne FM receiver - Multiplexing - demultiplexing.";

            String Content5 = "Binary concept- logic gates AND, OR gates using diodes - logic gates AND, OR and NOT gates using Transistors - truth tables - NAND and NOR as Universal gates - Boolean algebra Simplification of Boolean expression and its implementation using logic gates - De Morgan's laws and their circuit implications Arithmetic circuits: types - RS flip flop - D flip flop - level Half adder Full adder- Flip Flops checking and edge triggering - J-K flip flop.";


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

            String SubName = "Computer Graphics";
            String AuthorName = "Author: Donald Hearn and Pauline Baker M.";
            String BookName = "Book Name: Computer Graphics C, version 2nd Edition, Prentice Hall, 2011(Reprint)";

            String Unit1 = "Unit 1: Overview of Graphics System";
            String Unit2 = "Unit 2: 2D Transformations";
            String Unit3 = "Unit 3: 2D Viewing and Clipping";
            String Unit4 = "Unit 4: Graphical User Interfaces and 3D Transformations";
            String Unit5 = "Unit 5: Visible Surface Detection Methods";

            String Content1 = "Raster scans display - Random scan display - Graphics software - Output Primitives: Points and Lines - Line drawing algorithms: DDA Algorithm - Bresenham's Line Algorithm - Circle generating algorithm: Properties of Circles - Mid Point Circle Generation Algorithm.";
            String Content2 = "Two Dimensioanal Transformation: Transistion - Scaling - Rotation - Homogeneous Representation - Inverse Transformation - Composite Transformation: Pivot point Rotation - fixed point scaling - Other Transformation: Reflection - Shear.";
            String Content3 = "The Viewing pipeline - Window to Viewport coordinate Transformstion - Clipping operation - Point Clipping - line clipping: Cohen Sutherland line clipping - Polygon clipping: Sutherland Hodegeman polygon clipping.";
            String Content4 = "he User Dialogue - Input of Graphical Data: Locator, Stroke, String, Valuator, And Choice, Pick devices - Interactive picture construction techniques - Three Dimensional Display methods: 3D Transformation.";
            String Content5 = "Visible Surface Detection: Back Face Detection - Depth Buffer Method - A Buffer Method - Scan Line Method - Depth Sorting Method - Area Subdivision Method.";

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

            String SubName = "Relational Database Management System";
            String AuthorName = "Author: Rajesh Narang";
            String BookName = "Book Name: Database Management System, PHI Learning Private Limited, New Delhi, Fifth Printing, 2010";

            String Unit1 = "Unit 1: Introduction to Database Concepts";
            String Unit2 = "Unit 2: Storage and Relational Data Structures";
            String Unit3 = "Unit 3: Normalization";
            String Unit4 = "Unit 4: Structured Query Language (SQL)";
            String Unit5 = "Unit 5: Procedural Language (PL/SQL)";

            String Content1 = "Introduction : Flat File - Database System Database Advantages Architecture Database Management System as Implemented in Modern Database Packages - System Databases.\n\nThe Entity Relationship Model : Introduction - The Entity Relationship Model – Entities - Entity Sets - Relationships - Relationship Sets - Mapping Cardinalities Mapping Constraints - Keys - Roles in E-R Diagram Weak Entity Sets in E-R Diagrams - Non Binary Relationships - Combining Two E-R Diagrams - Representation of Strong and Weak Entity Sets - Linking a Weak to a Strong Entity - Breaking Higher Cardinalities into Lower Cardinalities -- Use of Entity or Relationship Sets - Generalization - Aggregation.\n\nData Models: Introduction - Relational Approach - Relational Rules The Hierarchical Approach - Hierarchical Model - The Network Approach Higher Level Operations.";
            String Content2 = "Storage Structure : File Organization and Addressing Schemes - Sequential and Indexed Sequential Organizations - Direct Organization of File - Interface Indexing - Hashing Scheme of File Organization - Dynamic Hashing Technique - Insertion Scheme in Dynamic Hashing - B-Trees - Indexing Methods -Clustering\n\nRelational Data Structure: Introduction - Relations - Domains.";
            String Content3 = "Normalization: Introduction - Purpose of Normalization - Normalization Definition of Functional Dependence (FD) - Normal Forms: INF, 2NF, 3NF and BCNF.";
            String Content4 = "Creating, Dropping and Altering Tables - create table - drop table - alter table -- Inserting Rows -- Querying the Database - Simple select Statement Sub-Selects -- Aggregate Functions - String, Number and Date Functions - SET Operations - Views - create view - drop view -- Modifying the Database -- insert - update - delete Statements.";
            String Content5 = "Data Types and Variables - Program Control Statements - null Statement - Assignment Statement - Conditional Statements -- Loops - Program Structure - Anonymous Blocks - Procedures and Functions - Stored Procedures and Functions - Packages - Triggers - Database Access using Cursors";

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

            String SubName = "Microprocessor and its Applications";
            String AuthorName = "Author: Triebel. et al.";
            String BookName = "Book Name: The 8088 and 8086 Microprocessors Programming, Interfacing Software, Hardware and Applications. 4th Editions. New Delhi: Prentince Hall of the India, 2011";

            String Unit1 = "Unit 1: Software Architecture and Machine Coding";
            String Unit2 = "Unit 2: Microprocessor Programming - I";
            String Unit3 = "Unit 3: Microprocessor Programming - II";
            String Unit4 = "Unit 4: I/O Interface of the 8086 Microprocessor";
            String Unit5 = "Unit 5: Interrupt Interface of the 8086";

            String Content1 = "Microcomputer : PC – Architecture – Microprocessor Evolution – micro architecture of the 8088/8086 - Software Model - Memory Address Space And Data Organization - Data Type - Segment Registers And Memory Segmentation - Dedicated And General Use Of Memory - Instruction Pointer - Data Registers - Pointer And Index Registers - Status Register - Generating A Memory Address - The Stack - I/O Address Space - Addressing Modes.";
            String Content2 = "The Instruction Set Of 8086 - Data Transfer Instructions - Arithmetic Instructions - Logic Instructions - Shift Instructions - Rotate Instructions.";
            String Content3 = "Flag Control Instructions - Compare Instructions - Control Flow and the Jump Instructions - Subroutines and Subroutine - Handling Instructions - The Loop and The Loop Handling Instructions - Strings And String - Handling Instructions.";
            String Content4 = "8088 and 8086 Microprocessors – Minimum mode and Maximum mode systems – Minimum mode Interface Signals – Maximum mode Interface Signals –Memory Control Signals – Read and Write cycles.";
            String Content5 = "Interrupt Mechanism, Types, and Priority – Interrupt Vector Table - Interrupts Instructions - Enabling/Disabling Of Interrupts - External Hardware Interrupt Interface -External Hardware Interrupt Sequence - 8259A Programmable Interrupt Controller -Software Interrupt - Non- Maskable Interrupt – Reset - Internal Interrupt Functions - DMA.";


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

        I2.setOnClickListener(view -> {
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.nav_default_enter_anim);
            I2.startAnimation(animation);
            Intent intent = new Intent(Subjects.this, SyllabusActivity.class);

            String SubName = "English for Basic Communication";
            String Unit1 = "Unit 1";
            String Unit2 = "Unit 2";
            String Unit3 = "Unit 3";
            String Unit4 = "Unit 4";
            String Unit5 = "Unit 5";

            String Content1 = "Speaking:\nRemembering someone, persuading someone - Dialogues in the hospital\n\nWriting:\nVocabulary: Nouns - Sickness/Disease Verbs: Verbs used in Hospital.\nIdioms: of sickness and health\nGrammar: Subject Verb Agreement, Punctuation\nWriting: Using Subject Verb Agreement and Punctuation taught in the Unit.\nProse: Mohandas Gandhi by Salman Rushdie";

            String Content2 = "Speaking:\nComplimenting and Congratulating, Expressing Sympathy, Dialogues at work\n\nWriting:\nVocabulary: Nouns - Various Trees and Plants Verbs: Gardening and Farming\nIdioms: of trees, plants and fruits\nGrammar: Direct and Indirect Speech. Verb Complements\nWriting: Using Direct and Indirect Speech, Verb Complements taught in the Unit\nProse: Manners and Etiquettes";

            String Content3 = "Speaking: Complaining, Apologizing - Dialogues related to Transportation, Professions\n\nWriting:\nVocabulary: Nouns - Vehicles and their parts, Professions: Verbs: Related to Transportation and Professions\nIdioms: Job/Profession related\nGrammar: Conditional Statements\nWriting: Using Conditional statements taught\nShort Story: The Mountain Trail by Anil Chandra";

            String Content4 = "Speaking: Making suggestions, Warning someone, Dialogues related to weather, season, etc.\n\nWriting:\nVocabulary: Nouns - Earth, Weather, Climate, Seasons and Natural Calamities\nVerbs: related to the above nouns\nIdioms: of earth, weather, climate and seasons\nGrammar: Questions, Negation, Command and Request\nWriting: Using the Questions, Negation, Command and Request taught in the Unit.\nPoem: The Road Not Taken by Robert Frost & On His Blindness by John Milton.";

            String Content5 = "Speaking: Asking about possibility, asking if someone is sure and Related Dialogues on Universe, roads and traffic signals\n\nWriting:\nVocabulary: Nouns - Universe, Roads and Traffic Signals;\nVerbs: Related verbs and 1000 most frequently used verbs.\nIdioms: Universe, roads and transportation\nGrammar: Active and Passive Voice, Run-on Sentences Using Active and Passive Voice, avoiding Run-on Sentences\nDrama: Merchant of Venice by William Shakespeare - The Trial Scene.";


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
        Intent intent = new Intent(Subjects.this, Home.class);
        startActivity(intent);
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