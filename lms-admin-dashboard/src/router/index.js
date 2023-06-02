import { createRouter, createWebHistory } from 'vue-router'
import HomeView from "@/views/HomeView.vue";
import AppLayout from "@/layout/AppLayout.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      component: AppLayout,
      children: [
        {
          path: "/",
          component: HomeView
        },
        {
          path: "/projects",
          name: "projects",
          component: () => import("@/views/manage-course/ProjectsView.vue")
        },
        {
          path: "/lectures",
          name: "lectures",
          component: () => import("@/views/manage-course/LecturesView.vue")
        },
        {
          path: "/tests",
          name: "tests",
          component: () => import("@/views/manage-course/TestsView.vue")
        },
        {
          path: "/students",
          name: "students",
          component: () => import("@/views/manage-students/StudentsView.vue")
        },
        {
          path: "/groups",
          name: "groups",
          component: () => import("@/views/manage-students/GroupsView.vue")
        },
        {
          path: "/statistic",
          name: "statistic",
          component: () => import("@/views/manage-students/StatisticsView.vue")
        }
      ]
    },
  ]
})

export default router
