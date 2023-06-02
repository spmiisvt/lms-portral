<script setup>
import { ref } from 'vue';

import AppMenuItem from './AppMenuItem.vue';

const model = ref([
    {
        label: 'Управление курсом',
        items: [
            { label: 'Главная', icon: 'pi pi-fw pi-home', to: '/' },
            { label: 'Проекты', icon: 'pi pi-fw pi-server', to: '/projects' },
            { label: 'Лекции', icon: 'pi pi-fw pi-list', to: '/lectures' },
            { label: 'Тесты', icon: 'pi pi-fw pi-check-square', to: '/tests' },
        ]
    },
    {
        label: 'Управление студентами',
        items: [
            { label: 'Студенты', icon: 'pi pi-fw pi-user', to: '/students' },
            { label: 'Группы', icon: 'pi pi-fw pi-table', to: '/groups' },
            { label: 'Статистика', icon: 'pi pi-fw pi-chart-bar', to: '/statistic' },
        ]
    },
    {
        label: 'Дополнительно',
        icon: 'pi pi-fw pi-briefcase',
        to: '/pages',
        items: [
            {
                label: 'Que',
                icon: 'pi pi-fw pi-globe',
                to: '/landing'
            },
            {
                label: 'Профиль',
                icon: 'pi pi-fw pi-user',
                items: [
                    {
                        label: 'Редактировать',
                        icon: 'pi pi-fw pi-sign-out',
                        to: '/profile'
                    },
                    {
                        label: 'Выйти',
                        icon: 'pi pi-fw pi-sign-out',
                        to: '/logout'
                    },
                ]
            },
        ]
    },
]);
</script>

<template>
    <ul class="layout-menu">
        <template v-for="(item, i) in model" :key="item">
            <app-menu-item v-if="!item.separator" :item="item" :index="i"></app-menu-item>
            <li v-if="item.separator" class="menu-separator"></li>
        </template>
    </ul>
</template>

<style lang="scss" scoped></style>
