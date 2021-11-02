# MultiChiefInventory
<p><b>MultiChief</b> is an experimental microservice-based ERP system for construction industry (on-line and off-line interaction between departments and employees). <p/>
<p><b>MultiChiefInventory</b> is a microservice that is responsible for preparing data (DTO) for MultiChiefMain (main service <a href="https://github.com/LevGoryachev/MultiChiefMain">MultiChiefMain</a>).</p> 
<p><b>Summary: Java 11, Spring-Boot, Spring Security, Spring Data JPA (Hibernate)</b></p>
<p><b>Database: PostgreSQL</b></p>

<p>Database structure in files:</p>
<ul>
<li><b>MultiChiefInventory_DDL_v1.2.sql</b></li>
</ul>

<h3>Database scheme</h3>

![MultiChiefInventory_DB_v1_1](https://user-images.githubusercontent.com/61917893/134813791-eff22c25-8e58-47b9-ae89-4bcde96800f2.jpg)


<p>Descriptions:</p>

<ul>
<li>bomOld - bill of materials</li>
<li>im_order - internal material imOrder</li>
<li>qty - quantity (warehouse_qty, bom_qty, order_qty)</li>
</ul>

<p>MultiChief (ERP). License: GNU GPL v3. Copyright (C) 2021 Lev Goryachev.</p>
