package com.jian.principle.singleresponsibility;

    /**
     * @author: JianJian
     * @date: 2023/10/27 0:35
     * @description: 单一职责原则
     */
    public class SingleResponsibility2 {
        public static void main(String[] args) {
            RoadVehicle roadVehicle = new RoadVehicle();
            roadVehicle.run("摩托车");

            AirVehicle airVehicle = new AirVehicle();
            airVehicle.run("飞机");
        }

        //交通工具类  方式2
        //1. 遵守单一职责原则
        //2. 但是这样做的改动很大，即将类分解 又同时修改了客户端
        //3. 改进：直接修改Vehicle类，改动的代码会比较少 -> 方案3
        static class RoadVehicle {
            public void run(String vehicle) {
                System.out.println(vehicle + "在公路上跑.....");
            }
        }

        static class AirVehicle {
            public void run(String vehicle) {
                System.out.println(vehicle + "在天上飞.....");
            }
        }

        static class WaterVehicle {
            public void run(String vehicle) {
                System.out.println(vehicle + "在水上游.....");
            }
        }

    }
