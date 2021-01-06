package com.djs.flyWeight;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


/**
 * 享元模式
 * */
class Bullet {
        public UUID id = UUID.randomUUID();
        boolean living = true;

        public boolean isLiving() {
            return living;
        }

        public void setLiving(boolean living) {
            this.living = living;
        }

        @Override
        public String toString() {
            return "Bullet{" +
                    "id=" + id +
                    ", living=" + living +
                    '}';
        }
    }

    class BulletPool {
        List<Bullet> bullets = new ArrayList<>();

        int initNum=10;
        {
            for (int i = 0; i < initNum; i++) {
                bullets.add(new Bullet());
            }
        }

        public synchronized Bullet  getBullet() {

            for (int i = 0; i < bullets.size(); i++) {

                Bullet b = bullets.get(i);
                if (!b.living) {
                    return b;
                }
            }
            Bullet newBullet = new Bullet();
            bullets.add(newBullet);

            System.out.println("线程池bullet的个数"+bullets.size());
            return newBullet;
        }




        public static void main(String[] args) {
            BulletPool bulletPool;
            bulletPool = new BulletPool();



            //开一个线程，隔断事件让一个Bullet状态变成死的

          Thread thread01=new Thread(()->{

              while (true){
                  Bullet bullet = bulletPool.getBullet();
                  System.out.println("这是我取出的bullet"+bullet);
                  try {
                      Thread.sleep(30);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }

              }
          });





            //开一个线程，去线程池里面拿bullet

            Thread thread02=new Thread(()->{

                while (true){
                    Bullet bullet = bulletPool.getBullet();

                    bullet.setLiving(false);
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            });

            thread01.start();
           thread02.start();


        }

    }



