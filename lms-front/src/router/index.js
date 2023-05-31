import { createRouter, createWebHistory } from 'vue-router'
import HomeView from "@/views/HomeView.vue";
import LoginView from "@/views/LoginView.vue";
import RegisterView from "@/views/RegisterView.vue";
import DashboardAdmin from "@/views/admin/DashboardAdmin.vue";

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: "/login",
      name: "Login",
      component: LoginView
    },
    {
      path: "/register",
      name: "Register",
      component: RegisterView
    },
    {
      path: '/admin/dashboard',
      name: 'DashboardAdmin',
      component: DashboardAdmin,
      children: [
        {
          path: 'profile',
          name: 'Profile',
          component: "",
        },
        {
          path: 'projects',
          name: 'Projects',

          children: [
            {
              path: "",
              component: () => import("@/views/admin/ProjectsAdminView.vue"),
            },
            {
              path: ':id',
              name: "Project",
              component: () => import("@/views/admin/ProjectEditAdminView.vue"),
            }
          ]
        },
        {
          path: 'theory',
          name: 'Theory',
          component: () => import("@/views/admin/TheoryAdminView.vue"),
          children: [
            {
              path: ":id",
              name: "Lecture",
              component: ""
            }
          ]
        },
        {
          path: 'survey',
          name: 'Survey',
          component: "",
        },
        {
          path: 'statistic',
          name: 'Statistic',
          component: "",
        },
        {
          path: 'tasks',
          name: 'Tasks',
          component: "",
        },
        {
          path: 'students',
          name: 'Students',
          component: "",
        },
        {
          path: 'groups',
          name: 'Groups',
          component: "",
        }
      ]
    },
  ]
})

export default router
