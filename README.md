# Rescue Robot Project

## Problem Description

โปรแกรมนี้จำลองหุ่นยนต์กู้ภัยที่สามารถบิน วิ่ง ตรวจจับความร้อน และส่งพิกัด เพื่อช่วยค้นหาผู้ประสบภัยในพื้นที่อันตราย

## Learning Objectives

* เข้าใจแนวคิด OOP
* การใช้ Interfaces หลายตัว
* การใช้ Composition
* การออกแบบระบบเชิงวัตถุ

## System Design

RescueRobot implements:

* Flyable
* Drivable
* ThermalSensor
* Communicable

RescueRobot has:

* Battery
* GPSTracker
* ThermalCamera

## OOP Concepts Used

**Encapsulation:** ใช้ private fields เพื่อป้องกันข้อมูล
**Abstraction:** ใช้ interface กำหนดความสามารถ
**Polymorphism:** class ใช้งานหลาย interface
**Composition:** รวมความสามารถผ่าน objects

## Why Java cannot inherit multiple classes

Java ไม่รองรับ multiple inheritance ของ class เพื่อป้องกัน Diamond Problem และความสับสนของ method

## Resolving default method conflict

เมื่อหลาย interface มี default method ชื่อเดียวกัน เรา override และใช้:
Flyable.super.status() และ Drivable.super.status()

## How to Run

javac Main.java
java Main
