'use client'

import React, {useEffect, useState} from 'react'
import AppHeader from "@/app/components/AppHeader";
import axios from "axios";

const Page = () => {
    // state to set all categories
    const [categories,setCategories] = useState<string[]>([]);

    useEffect(() => {
        getCategories();
    },[])

    //find all categories function
    const getCategories = async () => {
        try {
            const response = await axios.get(`${process.env.NEXT_PUBLIC_API_BASE_URL}/categories`);
            console.log(response.data.entityList);
            setCategories(response.data.entityList)
        } catch (err) {
            console.log(err);
        }
    }

    return (
        <div>
        {/*    header section*/}
            <div>
                <AppHeader />
            </div>

        {/*    category tiles*/}
            <div>

            </div>
        </div>
    )
}
export default Page
